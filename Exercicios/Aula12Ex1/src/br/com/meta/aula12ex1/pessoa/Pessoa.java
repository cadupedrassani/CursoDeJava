package br.com.meta.aula12ex1.pessoa;

import br.com.meta.aula12ex1.banco.*;

public class Pessoa {
	
	private int agencia;
	private int conta;
	private int senha;
	private double saldo;
	private String nome;
	private int user;

	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public Pessoa(){}
	public Pessoa(int agencia, int conta, int senha, String nome) {
		this.agencia = agencia;
		this.conta = conta;
		this.senha = senha;
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
