package br.com.meta.aula11ex2.pessoa;

import br.com.meta.aula11ex2.util.Numeros;

public abstract class PessoaIMC extends Pessoa{
	
	private double peso;
	private double altura;

	public PessoaIMC(){}
	
	public PessoaIMC(String nome, int dataNascimento, double peso, double altura) {
		super(nome, dataNascimento);
		this.altura = altura;
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularIMC(){
		double imc = (this.getPeso() / (this.getAltura() * this.getAltura()));
		return Numeros.RoundTo2Decimals(imc);
	}

	public abstract String resultadoIMC();
	
	public String imprimir(){
		String ret = super.imprimir();
		ret += "\nPeso: " + getPeso() + " kg";
		ret += "\nAltura: " + getAltura();
		return ret;
	}
	
}
