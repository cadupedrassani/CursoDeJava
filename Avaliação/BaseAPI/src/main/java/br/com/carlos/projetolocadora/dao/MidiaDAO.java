package br.com.carlos.projetolocadora.dao;

import org.hibernate.Criteria;

import br.com.carlos.projetolocadora.modelo.Midia;
import br.com.carlos.projetolocadora.util.PesquisaBean;

public class MidiaDAO extends GenericoDAO<Midia, Integer>{

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		Midia o = (Midia) pesquisaBean.getEntidade();
		
		if(o == null){
			return;
		}
	}

}
