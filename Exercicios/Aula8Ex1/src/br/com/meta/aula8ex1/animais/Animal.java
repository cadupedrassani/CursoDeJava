package br.com.meta.aula8ex1.animais;

public class Animal {

	private String nome;
	private double comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	private String som;
	
	public Animal(String nome, double comprimento, int patas, String cor,
			double velocidade, String ambiente) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	
	public String getNome()	{
		return nome;
	}
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public void alteraNome(String nome){
		this.nome = nome;
	}
	
	public void alteraComprimento(int comprimento){
		this.comprimento = comprimento;
	}
	
	public void alteraPatas(int patas){
		this.patas = patas;
	}
	
	public void alteraCor(String cor){
		this.cor = cor;
	}
	
	public void alteraAmbiente(String ambiente){
		this.ambiente = ambiente;
	}
	
	public void alteraVelocidade(float velocidade){
		this.velocidade = velocidade;
	}
	
	public String dados(){
		 String msg = "Animal: " + nome;
		 msg += "\nComprimento: " + comprimento + " cm";
		 msg += "\nPatas: " + patas;
		 msg += "\nCor: " + cor;
		 msg += "\nAmbiente: " + ambiente;
		 msg += "\nVelocidade: " + velocidade + " m/s";
		 return msg;
	}

	public String comportamento() {
		// TODO Auto-generated method stub
		return null;
	}
}
