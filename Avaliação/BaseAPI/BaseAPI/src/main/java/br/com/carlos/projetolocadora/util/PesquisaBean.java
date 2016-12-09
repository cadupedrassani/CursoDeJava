package br.com.carlos.projetolocadora.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Cleiton
 */
public class PesquisaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Object entidade;
    private Integer primeiroResultado;
    private HashMap<String, Object> listaParam;
    private Integer numResultados;
    private Integer maxItensPagina;
    private Integer paginaAtual;
    private boolean distinct;
    private List<String> objetosParaInicializarHibernate;
    
    /**
     *  OPERADORES ESTAO ORDENADOS POR SEU NUMERO DECIMAL
     *  EXEMPLO: OPERADORES STRINGS DE 0 A 9
     */
    //OPERADORES PARA STRINGS
    public static final int STR_COMECA_COM = 0;
    public static final int STR_EXATA = 1;
    public static final int STR_PARCIAL = 2;
    public static final int STR_TERMINA_COM = 3;
    public static final int STR_DIFERENTE_DE = 4;
    public static final int STR_PARCIAL_DIFERENTE_DE = 5;
    public static final int STR_IN = 6;
    //OPERADORES PARA DATAS E NUMEROS
    public static final int DAT_NUM_IGUAL = 10;
    public static final int DAT_NUM_MENOR = 11;
    public static final int DAT_NUM_MENOR_IGUAL = 12;
    public static final int DAT_NUM_ENTRE = 13;
    public static final int DAT_NUM_NAO_ENTRE = 14;
    public static final int DAT_NUM_DIFERENTE = 15;
    public static final int DAT_NUM_MAIOR = 16;
    public static final int DAT_NUM_MAIOR_IGUAL = 17;
    //OPERADORES PARA CLAUSULAS IN
    public static final int IN = 20;
    public static final int NOT_IN = 21;
    //OPERADORES PARA TODOS TIPOS DE ATRIBUTOS 
    public static final int NULO = 30;
    public static final int NAO_NULO = 31;
    //OPERADORES PARA COLECOES 
    public static final int C_VAZIO = 40;
    public static final int C_NAO_VAZIO = 41;
    //OPERADOR PARA STRING
    public static final int STR_PARCIALNOCASESENSITIVY = 42;
    public static final int BETWEEN = 43; 
    public static final int NOT_BETWEEN = 44; 
    public static final int OR = 45; 
    public static final int AND = 46;

    public PesquisaBean() {
    }

    public PesquisaBean(Object entidade) {
        this.entidade = entidade;
        this.objetosParaInicializarHibernate = new ArrayList<String>();
    }

    public PesquisaBean(PesquisaBean pesquisaBean) {

        this.entidade = pesquisaBean.getEntidade();
        this.primeiroResultado = pesquisaBean.getPrimeiroResultado();
        this.listaParam = pesquisaBean.getListaParam();
        this.numResultados = pesquisaBean.getNumResultados();
        this.maxItensPagina = pesquisaBean.getMaxItensPagina();
        this.paginaAtual = pesquisaBean.getPaginaAtual();
        this.distinct = pesquisaBean.isDistinct();

    }

    public PesquisaBean(Object entidade, HashMap<String, Object> params) {
        this.entidade = entidade;
        this.listaParam = params;
    }
    public HashMap<String, Object> getListaParam() {
        if (listaParam == null) {
            listaParam = new HashMap<String, Object>();
        }
        return listaParam;
    }

    public void setListaParam(HashMap<String, Object> listaParam) {
        this.listaParam = listaParam;
    }

    public Integer getPrimeiroResultado() {
        return primeiroResultado;
    }

    public void setPrimeiroResultado(Integer primeiroResultado) {
        this.primeiroResultado = primeiroResultado;
    }

    public Object getEntidade() {
        return entidade;
    }

    public void setEntidade(Object entidade) {
        this.entidade = entidade;
    }

    public Integer getMaxItensPagina() {
        return maxItensPagina;
    }

    public void setMaxItensPagina(Integer maxItensPagina) {
        this.maxItensPagina = maxItensPagina;
    }

    public Integer getNumResultados() {
        return numResultados;
    }

    public void setNumResultados(Integer numResultados) {
        this.numResultados = numResultados;
    }

    public Integer getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(Integer paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public List<String> getObjetosParaInicializarHibernate() {
        return objetosParaInicializarHibernate;
    }

    public void setObjetosParaInicializarHibernate(List<String> objetosParaInicializarHibernate) {
        this.objetosParaInicializarHibernate = objetosParaInicializarHibernate;
    }
}
