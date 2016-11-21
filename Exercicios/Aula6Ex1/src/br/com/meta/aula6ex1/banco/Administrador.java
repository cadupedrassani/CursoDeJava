package br.com.meta.aula6ex1.banco;

public class Administrador {

	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean verificaSenha(){
		return (this.senha == 123);
	}
}
