package br.com.meta.aula8ex1.animais;

public class Anfibio extends Animal {

	private String caracteristica;
	
	public Anfibio(String nome, double comprimento, int patas, 
			String cor, double velocidade, String ambiente, String som) {
		super(nome, comprimento, patas, cor, velocidade, ambiente);
		this.setPatas(patas);
		this.setAmbiente(ambiente);
		this.setCor(cor);
		this.caracteristica = " Barbatana e cauda";
		this.setSom(som);
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public void alteraCaracteristica(String caracteristica){
		this.caracteristica = caracteristica;
	}
	
	public String caracteristica(){
		String msg;
		msg = "Caracteristica: " + caracteristica;
		return msg;
	}
	
	public String comportamento(){
		String msg;
		msg = "Nadar";
		return msg;
	}
	
	public String dados(){
		String msg = super.dados();
		msg += "\nCaracteristica:" + caracteristica + "\nSom: " + getSom();
		return msg;
	}
	
}
