
public class Mamifero extends Animal{
	
	private String alimento;
	
	public Mamifero(String nome, double comprimento, int patas, String cor, 
			double velocidade, String ambiente){
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.setAmbiente(ambiente);
	}
	
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public void alteraAlimento(String alimento){
		this.alimento = alimento;
	}
	
	public String alimento(){
		String msg = this.alimento;
		return msg;
	}
	
	public String dados(){
		String msg = super.dados();
		msg += "\nAlimento:" + alimento;
		return msg;
	}
}
