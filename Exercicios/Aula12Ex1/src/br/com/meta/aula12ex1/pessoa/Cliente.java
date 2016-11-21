package br.com.meta.aula12ex1.pessoa;

import java.math.BigDecimal;

import br.com.meta.aula12ex1.banco.Banco;

public class Cliente extends Pessoa {
	
	public Cliente(){}
	public Cliente(int agencia, int conta, int senha, double saldo, String nome) {
		super(agencia, conta, senha, nome);
	}
}
