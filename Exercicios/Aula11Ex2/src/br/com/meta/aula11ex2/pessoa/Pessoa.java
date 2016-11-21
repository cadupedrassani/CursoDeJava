package br.com.meta.aula11ex2.pessoa;

public class Pessoa {
	
	private String nome;
	private int dataNascimento;
	
	public Pessoa() {}
	
	public Pessoa(String nome, int dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int obterIdade(){
		int idade;
		idade = 2016 - getDataNascimento();
		return idade;
	}
	
	public String imprimir(){
		String ret = "";
		ret += "Nome: " + getNome();
		ret += "\nData de Nascimento: ";
		ret += "\nIdade: " + obterIdade() + " anos";
		return ret;
	}

}
