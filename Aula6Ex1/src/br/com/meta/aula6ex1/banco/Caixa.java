package br.com.meta.aula6ex1.banco;
import java.util.ArrayList;

public class Caixa {
	
	private final Integer[] notas = new Integer[] {50, 20, 10, 5, 2 };
	private double valorCaixa;
	private double valorSaque;
	private ArrayList<Cedula> cedulas;

	public Caixa(){
		cedulas = new ArrayList<Cedula>();
	}
	
	public void addCedulas(Cedula cedulas) {
		this.cedulas.add(cedulas);
	}

	public double getValorCaixa() {
		return valorCaixa;
	}

	public void setValorCaixa(double valorCaixa) {
		this.valorCaixa = valorCaixa;
	}

	public double getValorSaque() {
		return valorSaque;
	}

	public void setValorSaque(double valorSaque) {
		this.valorSaque = valorSaque;
	}
	
	public void reporCedula(int qtd) {
		for(Cedula cedula : cedulas) {
			cedula.setQtdCedula(cedula.getQtdCedula()+qtd);
		}
	}
	
	public String mostrarCedula(){
		String retorno = "";
		for(Cedula cedula : cedulas){
			retorno += cedula.getTipoCedula() + " ";
		}	
		return retorno;
	}
	
	public String mostrarQtdCedulas(){
		String retorno = "";
		for(Cedula cedula : cedulas){
			retorno += cedula.getTipoCedula() +	" Quantidade: " + cedula.getQtdCedula() + "\n";
		}	
		return retorno;
	}
	public void adicionaCedula(int nomeCedula, int quantidade){
		for(Cedula cedula : cedulas){
			if(cedula.getTipoCedula() == nomeCedula){
				cedula.setQtdCedula(cedula.getQtdCedula() + quantidade);
				break;
			}
		}
	}
	public void removeCedula(int nomeCedula, int quantidade){
		for(Cedula cedula : cedulas){
			if(cedula.getTipoCedula() == nomeCedula){
				cedula.setQtdCedula(cedula.getQtdCedula() - quantidade);
				break;
			}
		}
	}
	
	public boolean verificaCedula(int nomeCedula, int divisao){
		for(Cedula cedula : cedulas){
			if (cedula.verificaCedula(nomeCedula, divisao)){
				return true;
			}
		}
		return false;
	}
	
	public String sacar() {
		String mostraNota = "";
		int resultado = 0;
		int divisao = 0;
		if (valorSaque == 1 || valorSaque == 3)
			return "Valor de saque invalido";
		for (Integer nota : notas) {
			if (valorSaque >= nota) {
				resultado = (int) Math.floor(valorSaque % nota);
				divisao = (int) Math.floor(valorSaque / nota);
				if (resultado != 3 && resultado != 1) {
					mostraNota += " " + (valorSaque / nota) + "x" + nota;
					valorSaque = valorSaque - (nota * (valorSaque / nota));
				}
				if (nota >= 10 && resultado == 3) {
					valorSaque = valorSaque - 5;
					mostraNota += " " + "1x5";
				}
				if (nota >= 10 && resultado == 1) {
					valorSaque = valorSaque - 6;
					mostraNota += " " + "3x2";
				}
			}
		}
		return mostraNota;
	}
	
	/*public String sacar() {
		String mostraNota = "";
		int restoDaDivisao = 0;
		int divisao = 0;
		int ultimaCedula = 8;
		if (valorSaque == 1 || valorSaque == 3 || valorSaque <= total){
			return "Não foi possível realizar esta operação.";
		}
		for (Integer nota : notas) {
			if (valorSaque >= nota) {
				restoDaDivisao = (int) (valorSaque % nota);
				divisao = (int) (valorSaque / nota);
				if (verificaCedula(50,divisao) || verificaCedula(20,divisao) || verificaCedula(10,divisao) 
						|| verificaCedula(5,divisao) || verificaCedula(2,divisao)){
					if (nota == 0){ 
						removeCedula(50, divisao); ultimaCedula = nota; 
					}else if (nota == 1){ 
						removeCedula(20, divisao); ultimaCedula = nota; 
					}else if (nota == 2){ 
						removeCedula(10, divisao); ultimaCedula = nota; 
					}else if (nota == 3){ 
						removeCedula(5, divisao); ultimaCedula = nota; 
					}else if (nota == 4){ 
						removeCedula(2, divisao); ultimaCedula = nota; 
					}
					if (restoDaDivisao != 3 && restoDaDivisao != 1) {
						mostraNota += "Nota / quantidade sacada:  " + nota + " - " + (valorSaque / nota) + "\n";
						valorSaque = valorSaque - (nota * (valorSaque / nota));
					}
					if (nota >= 10 && restoDaDivisao == 3) {
						valorSaque = valorSaque - 5;
						mostraNota += "Nota / quantidade sacada:  " + "5 - 1" + " \n";
						removeCedula(5, 1);;
						adicionaCedula(notas[ultimaCedula], 1);
					}
					if (nota >= 10 && restoDaDivisao == 1) {
						valorSaque = valorSaque - 6;
						mostraNota += "Notas / quantidade sacada: " + "2 - 3" + "\n";
						removeCedula(2, 3);
						adicionaCedula(notas[ultimaCedula], 1);
					}
				}
				//else return "Não foi possivel realizar esta operação.";
			}			
		}
		return mostraNota;
	}*/
}


