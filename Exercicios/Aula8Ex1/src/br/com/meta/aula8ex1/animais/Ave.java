package br.com.meta.aula8ex1.animais;

public class Ave extends Animal {
	
	private String caracteristica;
	
	public Ave(String nome, double comprimento, int patas, String cor, 
			double velocidade, String ambiente, String som){
		super(nome, comprimento, patas, cor, velocidade, ambiente);
		this.caracteristica = " Penas e asas";
		this.setSom(som);

	}
	
	public String comportamento(){
		String msg;
		msg = "Voar";
		return msg;
	}
	
	public String dados(){
		String msg = super.dados();
		msg += "\nCaracteristica:" + caracteristica + "\nSom: " + getSom();
		return msg;
	}

}
