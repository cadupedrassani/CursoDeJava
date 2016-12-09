package br.com.carlos.projetolocadora.dao;

import org.hibernate.Criteria;

import br.com.carlos.projetolocadora.modelo.Endereco;
import br.com.carlos.projetolocadora.util.PesquisaBean;

public class EnderecoDAO extends GenericoDAO<Endereco, Integer> {

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		Endereco o = (Endereco) pesquisaBean.getEntidade();
		
		if(o == null){
			return;
		}
	}

}
