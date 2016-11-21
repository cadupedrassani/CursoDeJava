package br.com.meta.aula8ex1.animais;

public class Mamifero extends Animal{
	
	private String alimento;
	
	public Mamifero(String nome, double comprimento, int patas, String cor, 
			double velocidade, String ambiente, String alimento, String som){
		super(nome, comprimento, patas, cor, velocidade, ambiente);
		this.setAmbiente(ambiente);
		this.alimento = alimento;
		this.setSom(som);
	}

	public void alteraAlimento(String alimento){
		this.alimento = alimento;
	}
	
	public String alimento(){
		String msg = this.alimento;
		return msg;
	}
	
	public String comportamento(){
		String msg;
		msg = "Andar";
		return msg;
	}
	
	public String dados(){
		String msg = super.dados();
		msg += "\nAlimento: " + alimento + "\nSom: " + getSom();
		return msg;
	}
}
