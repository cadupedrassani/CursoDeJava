package br.com.meta.aula12ex1.pessoa;

import br.com.meta.aula12ex1.banco.Banco;

public class Administrador extends Pessoa {

	public Administrador(){}
	public Administrador(int agencia, int conta, int senha, String nome) {
		super(agencia, conta, senha, nome);
		// TODO Auto-generated constructor stub
	}

	public boolean verificarAcesso(){
		return (this.getSenha() == 123 
				&& this.getConta() == 999
				&& this.getAgencia() == 999);
	}
}