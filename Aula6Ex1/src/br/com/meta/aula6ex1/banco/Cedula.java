package br.com.meta.aula6ex1.banco;

public class Cedula {
	
	private int tipoCedula;
	private int qtdCedula;
	
	public int getTipoCedula() {
		return tipoCedula;
	}

	public void setTipoCedula(int tipoCedula) {
		this.tipoCedula = tipoCedula;
	}
	
	public int getQtdCedula() {
		return qtdCedula;
	}

	public void setQtdCedula(int qtdCedula) {
		this.qtdCedula = qtdCedula;
	}

	public boolean verificaCedula(int nomeCedula, int quantidade) {
		if (this.tipoCedula == nomeCedula && this.qtdCedula >= quantidade ) 
			return true;
		else 
			return false;
	}
}
