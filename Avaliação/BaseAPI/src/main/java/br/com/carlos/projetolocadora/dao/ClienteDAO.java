package br.com.carlos.projetolocadora.dao;

import java.io.Serializable;

import org.hibernate.Criteria;

import br.com.carlos.projetolocadora.modelo.Cliente;
import br.com.carlos.projetolocadora.util.PesquisaBean;

public class ClienteDAO extends GenericoDAO<Cliente, Integer>{

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		Cliente o = (Cliente) pesquisaBean.getEntidade();
		
		if(o == null){
			return;
		}
	}

}
