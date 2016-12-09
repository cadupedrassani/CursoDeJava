package br.com.carlos.projetolocadora.BaseAPI;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import br.com.carlos.projetolocadora.dao.CategoriaDAO;
import br.com.carlos.projetolocadora.dao.FilmeDAO;
import br.com.carlos.projetolocadora.modelo.Categoria;
import br.com.carlos.projetolocadora.modelo.Filme;
import br.com.carlos.projetolocadora.modelo.FilmePK;
import br.com.carlos.projetolocadora.util.PesquisaBean;

public class App 
{
    public static void main( String[] args )
    {
    	App aplicacao = new App();
    	Categoria categoria = new Categoria();
        CategoriaDAO dao = new CategoriaDAO();
        PesquisaBean pesquisaBean = new PesquisaBean(categoria);
        List<Categoria> categorias = new ArrayList<Categoria>();
        List<Filme> filmes = new ArrayList<Filme>();
       
        //categoria.setDescricao("Terror");
        //categoria.setDescricao("Comedia");
        //inserir categoria
        /*try{
          	dao.criar(categoria);
          	System.out.println("categoria criada com sucesso");
        }catch(Exception e){
      		System.out.println(e.getMessage());
      		e.printStackTrace();
      	}*/
        
        try{
        	categorias = dao.pesq(pesquisaBean, null);
        	aplicacao.criarFilme(categorias.get(0));
        	System.out.println("Filme inserido com sucesso.");
        }catch(Exception e){
        	System.out.println(e.getMessage());
        }        
    }
    
    public void criarFilme(Categoria categoria) throws Exception{
    	Filme filme = new Filme();
    	FilmePK pk = new FilmePK();
    	FilmeDAO dao = new FilmeDAO();
    	
    	pk.setCodFilme(1);
    	pk.setCategoria(categoria);
    	
    	filme.setDescricao("Xuxa");
    	filme.setAno(Calendar.getInstance());
    	filme.setResumo("Muita música");
    	filme.setClassificao(18);
    	
    	Calendar duracao = Calendar.getInstance();
    	duracao.set(Calendar.HOUR, 2);
    	duracao.set(Calendar.MINUTE, 0);
    	filme.setDuracao(duracao);
    	
    	dao.criar(filme);
    }
}
