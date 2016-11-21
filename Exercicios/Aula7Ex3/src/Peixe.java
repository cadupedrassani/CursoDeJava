
public class Peixe extends Animal {

	private String caracteristica;
	
	public Peixe(String nome, double comprimento, int patas, String cor, 
			String ambiente, double velocidade) {
		super(nome, comprimento, patas, ambiente, cor, velocidade);
		this.setPatas(patas);
		this.setAmbiente(ambiente);
		this.setCor(cor);
		this.caracteristica = " Barbatana e cauda";
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
	
	public String dados(){
		String msg = super.dados();
		msg += "\nCaracteristica:" + caracteristica;
		return msg;
	}
	
}
