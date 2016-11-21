package br.com.meta.caixaeletronico.cedula;

public class Cedula  {
	private int qtdCedula;
	private int cedulaValor;
	private String cedulaNome;
	
	public Cedula(){}
	public Cedula(String cedulaNome, int cedulaValor, int qtdCedula) {
		super();
		this.cedulaValor = cedulaValor;
		this.qtdCedula   = qtdCedula;
		this.cedulaNome = cedulaNome;
	}
	
	public int getCedulaValor()	{
		return cedulaValor;
	}

	public void setCedulaValor(int cedulaValor)	{
		this.cedulaValor = cedulaValor;
	}

	public String getCedulaNome() {
		return cedulaNome;
	}

	public void setCedulaNome(String cedulaNome){
		this.cedulaNome = cedulaNome;
	}
	
	public int getQtdCedula() {
		return qtdCedula;
	}

	public void setQtdCedula(int qtdCedula)	{
		this.qtdCedula = qtdCedula;
	}
	//Imprime no metodo qtdDisponivel
	@Override
	public String toString() {
		return "Cedula de " + getCedulaValor() +" - "+ getQtdCedula() + " cédulas disponiveis";
	}
}
