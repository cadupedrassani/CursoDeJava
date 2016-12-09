package br.com.carlos.projetolocadora.dao;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

import br.com.carlos.projetolocadora.modelo.IOrder;
import br.com.carlos.projetolocadora.util.HibernateUtil;
import br.com.carlos.projetolocadora.util.PesquisaBean;
/**
 *
 * @author Cleiton
 */
public abstract class GenericoDAO<T, PK extends Serializable> {
    
    private Session sessao;
    private static boolean controleCtrl = false;
    protected Class<T> tipo = getDomainClass();
    
    public GenericoDAO(){
        carregarSessao();
    }
    
    public Session getSessao(){
        return sessao;
    }
    
    public void setControleCtrl(boolean controleCtrl){
        this.controleCtrl = controleCtrl;
    }
    
    protected Class getDomainClass() {
        if (tipo == null) {
            ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
            tipo = (Class) thisType.getActualTypeArguments()[0];
        }
        return tipo;
    }
    
    public void carregarSessao(){
        if(this.sessao == null || !this.sessao.isOpen()){
            this.sessao = HibernateUtil.getSessionFactory().openSession();
        }
    }
    
    public void fecharSessao(){
        if(this.sessao.isOpen()){
            this.sessao.flush();
            this.sessao.close();
        }
    }
    
    protected boolean validarEncerramentoSessao(){
        if (this.controleCtrl == false && this.sessao != null && this.sessao.isOpen()) {
            return true;
        }
        
        return false;
    }
    
    public void criar(T o) throws Exception{
        Transaction tx = null;
        try{
            this.carregarSessao();
            tx = this.sessao.beginTransaction();
            this.sessao.save(o);
            tx.commit();
        }catch(Exception ex){
            if(tx != null){
                tx.rollback();
            }
            throw new Exception(ex);
        }finally{
            if(validarEncerramentoSessao()){
                fecharSessao();
            }
        }
        
    }
    
    public void editar(T o) throws Exception{
        Transaction tx = null;
        try{
            this.carregarSessao();
            tx = this.sessao.beginTransaction();
            this.sessao.merge(o);
            tx.commit();
        }catch(Exception ex){
            if(tx != null){
                tx.rollback();
            }
            throw new Exception(ex);
        }finally{
            if(validarEncerramentoSessao()){
                fecharSessao();
            }
        }
    }
    
    public void remover(T o) throws Exception{
        Transaction tx = null;
        try{
            this.carregarSessao();
            tx = this.sessao.beginTransaction();
            this.sessao.delete(o);
            tx.commit();
        }catch(Exception ex){
            if(tx != null){
                tx.rollback();
            }
            throw new Exception(ex);
        }finally{
            if(validarEncerramentoSessao()){
                fecharSessao();
            }
        }
    }
    
    private List<T> pesq(boolean all, int primeiroResultado, int maxItensPagina, IOrder... camposOrdenacao) throws Exception {
        List<T> resultado = null;
        Transaction tx = null;
        
        try {
            this.carregarSessao();
            tx = this.sessao.beginTransaction();
            StringBuffer sql = new StringBuffer();
            sql.append(" SELECT o FROM ");
            sql.append(tipo.getSimpleName());
            sql.append(" as o ");

            sql.append(setOrdemPesq(camposOrdenacao));
            
            Query q = (Query) this.sessao.createQuery(sql.toString()); 

            if (!all) {
                q.setMaxResults(maxItensPagina);
                q.setFirstResult(primeiroResultado);
            }

            resultado = q.getResultList();

            for (T resultadoAux : resultado) {
                this.sessao.refresh(resultadoAux);
            }
            tx.commit();

        } catch (Exception ex) {
            if(tx != null){
                tx.rollback();
            }	
            throw new Exception(ex);
        } finally {
            if(validarEncerramentoSessao()){
                fecharSessao();
            }
        }
        
        return resultado;
    }
    
    public List pesq(int primeiroResultado, int maxItensPagina, IOrder... camposOrdenacao) throws Exception{
        Transaction tx = null;
        List lista = null;
        
        try {
            this.carregarSessao();
            tx = this.sessao.beginTransaction();
            Criteria crit;
            
            crit = sessao.createCriteria(this.tipo);
            crit.setMaxResults(maxItensPagina);
            crit.setFirstResult(primeiroResultado);
            
            if(camposOrdenacao != null && camposOrdenacao.length > 0){
                for(IOrder ordem : camposOrdenacao){
                    crit.addOrder(setOrdemPesqHibernate(ordem.getCampo(), ordem.isDesc()));
                }
            }
            
            crit.getAlias();
            lista = crit.list();
            tx.commit();
           
        } catch (Exception ex) {
            if(tx != null){
                tx.rollback();
            }
            throw new Exception(ex);
        } finally {
            if(validarEncerramentoSessao()){
                fecharSessao();
            }
        }
        return lista;
    }
    
    protected String setOrdemPesq(IOrder... camposOrdenacao) {
        String retorno = "";
        if (camposOrdenacao != null && camposOrdenacao.length > 0) {
            StringBuffer ordemBuff = new StringBuffer("");
            ordemBuff.append(" ORDER BY ");
            for (IOrder campo : camposOrdenacao) {
                if(campo != null){
                    ordemBuff.append("o.");
                    ordemBuff.append(campo.getCampo());
                    ordemBuff.append((campo.isDesc() ? " desc" : " asc"));
                    ordemBuff.append(", ");
                }else{
                    return retorno;
                }
            }
            retorno = ordemBuff.toString().substring(0, ordemBuff.toString().length() - 2);
        }
        return retorno;
    }
    
    protected Order setOrdemPesqHibernate(String valor, boolean isDesc) {
        String retorno = valor;
        boolean isDescAux = isDesc;
        
        if(isDescAux){
            return Order.desc(retorno);
        }else{
            return Order.asc(retorno);
        }
        
    }
    
    public T pesqPorId(PK id) throws Exception {
        Transaction tx = null;
        T objeto = null;
        try {
            this.carregarSessao();
            tx = this.sessao.beginTransaction();
            objeto = (T) this.sessao.get(tipo, id);
            tx.commit();
            
        } catch (Exception ex) {
            if(tx != null){
                tx.rollback();
            }
            throw new Exception(ex);
        } finally {
            if(validarEncerramentoSessao())
                fecharSessao();
        }
        
        return objeto;
    }
    
    public int getCount(PesquisaBean pesquisaBean) throws Exception {
        Transaction tx = null;
        int count = 0;
        try {
            this.carregarSessao();
            tx = this.sessao.beginTransaction();
            Criteria crit;
            
            crit = sessao.createCriteria(this.tipo);
            
            setAtributoPesq(crit, pesquisaBean);
            crit.setProjection(Projections.rowCount());
            
            count = Integer.parseInt(crit.uniqueResult().toString());
            
            tx.commit();
            
        } catch (Exception ex) {
            if(tx != null){
                tx.rollback();
            }
            throw new Exception(ex);
        } finally {
            if(validarEncerramentoSessao())
                fecharSessao();
        }
        
        return count;
    }
    
    public List<T> pesq(IOrder... camposOrdenacao) throws Exception {
        Transaction tx = null;
        List lista = null;
        
        try {
            this.carregarSessao();
            tx = this.sessao.beginTransaction();
            Criteria crit;
            
            crit = sessao.createCriteria(this.tipo);
            
            if(camposOrdenacao != null && camposOrdenacao.length > 0){
                for(IOrder ordem : camposOrdenacao){
                    crit.addOrder(setOrdemPesqHibernate(ordem.getCampo(), ordem.isDesc()));
                }
            }
            crit.getAlias();
            lista = crit.list();
            tx.commit();
        } catch (Exception ex) {
            if(tx != null){
                tx.rollback();
            }
            throw new Exception(ex);
        } finally {
            if(validarEncerramentoSessao())
                fecharSessao();
        }
        
        return lista; 
    }
    
    protected String interpretarPesquisaBean(boolean count, PesquisaBean pesquisaBean, boolean distinct) throws Exception {
        StringBuffer queryBuff = new StringBuffer();
        String distinctStr = "";
        if (distinct) {
            distinctStr = "DISTINCT ";
        }
        Object objEntidade = pesquisaBean.getEntidade();
        String nomeClasse = objEntidade.getClass().getSimpleName();
        if (count) {
            if(pesquisaBean.getListaParam().containsKey("mudarcount")){
                queryBuff.append(" SELECT COUNT(o) ");
            }else{
                queryBuff.append(" SELECT COUNT(" + distinctStr + "o.id) ");
            }
        } else {
            queryBuff.append(" SELECT " + distinctStr + "o ");
        }
        queryBuff.append(" FROM " + nomeClasse + " o ");
        return queryBuff.toString();
    }
    
    public List<T> pesqGroupBy(PesquisaBean pesquisaBean, IOrder... camposOrdenacao) throws Exception {
        Transaction tx = null;
        List<T> lista = null;
        try {
            this.carregarSessao();
            Criteria crit;
            tx = this.sessao.beginTransaction();
            crit = sessao.createCriteria(pesquisaBean.getEntidade().getClass());
            
            this.setAtributoPesq(crit, pesquisaBean);
            
            if(camposOrdenacao != null && camposOrdenacao.length > 0){
                for(IOrder ordem : camposOrdenacao){
                    crit.addOrder(setOrdemPesqHibernate(ordem.getCampo(), ordem.isDesc()));
                }
            }
            crit.getAlias();
            lista = crit.list();
            tx.commit();
        } catch (Exception ex) {
            if(tx != null){
                tx.rollback();
            }
            ex.getMessage();
            throw new Exception(ex);
        } finally {
            if(validarEncerramentoSessao())
                fecharSessao();
        }
        
        return lista;
    }
    
    public Object consultarPorStringUnicoRegistro(String string) throws Exception {
        Object o = null;
        Transaction tx = null;
        
        try {
            
            this.carregarSessao();
            tx = this.sessao.beginTransaction();
            Query q = (Query) this.sessao.createSQLQuery(string);
            o = q.getResultList().get(0);
            tx.commit();
        } catch (Exception ex) {
            if(tx != null){
                tx.rollback();
            }
            throw new Exception("Falha ao Pesquisar registros");
        } finally{
            if(validarEncerramentoSessao())
                fecharSessao();
        }       
        
        return o;
    }
    
    public void iniciliazarObjetosLazy(List<String> propriedades, List valores){
    	
        if(propriedades != null && !propriedades.isEmpty()){
            for(String prop : propriedades){
                
                for(Object valor : valores){
                    try {
                        Method metodo = valor.getClass().getMethod(prop);
                        if(metodo.invoke(valor) != null){
                            Hibernate.initialize(metodo.invoke(valor));
                        }
                    } catch (NoSuchMethodException ex) {
                        Logger.getLogger(GenericoDAO.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SecurityException ex) {
                        Logger.getLogger(GenericoDAO.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(GenericoDAO.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalArgumentException ex) {
                        Logger.getLogger(GenericoDAO.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InvocationTargetException ex) {
                        Logger.getLogger(GenericoDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                
            }
        }
    }
    
    public List<T> pesq(PesquisaBean pesquisaBean, IOrder... camposOrdenacao) throws Exception {
        Transaction tx = null;
        List<T> lista = null;
        
        try {
            this.carregarSessao();
            Criteria crit;
            tx = sessao.beginTransaction();
            crit = sessao.createCriteria(pesquisaBean.getEntidade().getClass());
            
            setAtributoPesq(crit, pesquisaBean);
            
            if(camposOrdenacao != null && camposOrdenacao.length > 0){
                for(IOrder ordem : camposOrdenacao){
                    crit.addOrder(setOrdemPesqHibernate(ordem.getCampo(), ordem.isDesc()));
                }
            }
            crit.getAlias();
            lista = crit.list();
            this.iniciliazarObjetosLazy(pesquisaBean.getObjetosParaInicializarHibernate(), lista);
            
            tx.commit();
        } catch (Exception ex) {
            if(tx != null){
                tx.rollback();
            }
            ex.printStackTrace();
            ex.getMessage();
            throw new Exception(ex);
        } finally {
            if(validarEncerramentoSessao())
                fecharSessao();
        }
        
        return lista;
    }
    
    public void validarAliasCriteria(String propriedade, Criteria crit){
        if(!crit.toString().contains(propriedade)){
            crit.createAlias(propriedade, propriedade);
        }
    }
    
    public void validarAliasCriteria(String propriedade, Criteria crit, int join){
        if(!crit.toString().contains(propriedade)){
            crit.createAlias(propriedade, propriedade, join);
        }
    }
    
    protected abstract void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception;
}
