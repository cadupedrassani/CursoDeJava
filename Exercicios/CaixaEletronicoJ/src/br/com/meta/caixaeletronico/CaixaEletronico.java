package br.com.meta.caixaeletronico;
import java.util.ArrayList;

import br.com.meta.aula12ex1.pessoa.Pessoa;
import br.com.meta.caixaeletronico.cedula.Cedula;

public class CaixaEletronico {
		
	private int valorTotal=0;
	private int total=0;
	int resto50;
	int resto20;
	int resto10;
	int resto5;
	int resto2;
	
	private ArrayList<Cedula> cedulas;

	public CaixaEletronico(){
		cedulas = new ArrayList<Cedula>();
	}
	public void addCedulas(Cedula cedula){
		this.cedulas.add(cedula);
	}
	
	public void removeCedulas(int qtd){
		for (int i = 0; i < this.cedulas.size(); i++) {
			Cedula c = cedulas.get(i);
			if (c.getCedulaValor() == 50){
				c.setQtdCedula(c.getQtdCedula() - qtd);
			}else if (c.getCedulaValor() == 20){
				c.setQtdCedula(c.getQtdCedula() - qtd);
			}else if (c.getCedulaValor() == 10){
				c.setQtdCedula(c.getQtdCedula() - qtd);
			}else if (c.getCedulaValor() == 5){
				c.setQtdCedula(c.getQtdCedula() - qtd);
			}else if (c.getCedulaValor() == 2){
				c.setQtdCedula(c.getQtdCedula() - qtd);
			}//else 
				//System.out.println("Cedula Invalida.");
		}
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		
		this.total = total;
	}	
	//verifica a qtd de cada cedula
	public void getQtdDeCadaCedula(){	
		for(Cedula totalCedulas : cedulas)
			System.out.println(totalCedulas);
	}
	//Laco para pegar o valor total disponivel no caixa
	public String getValorTotalDisponivel(){	
		setTotal(0);
		for(Cedula valor : cedulas)	{	
			valorTotal = valor.getCedulaValor() * valor.getQtdCedula();
			total = getTotal() +valorTotal;
			setTotal(total);		
		}
		return "Total disponivel no caixa R$ " + getTotal();			
	}
	//Cedulas disponiveis no saque
	public String cedulasDisponiveisSaque(){
		String ret = "";
		for(Cedula cedulasDisp : cedulas){
			ret += "\n" + cedulasDisp.getCedulaValor();
		}
		return ret;
	}
	public void saque(int valor){
		int qtdCedula=0;

		for(Cedula saque : cedulas)	{
			if(valor <= 1500 && valor < getTotal()){//Verifica se tem o valor do saque
				if(((valor!= 0) && ((valor - 50) >= 0)) && 
						((valor - 50) != 1) && ((valor - 50) != 3)){
					saque.getCedulaNome().equals("Nota50"); //pega a nota de 50
					qtdCedula  = saque.getQtdCedula(); 	    //pega a quantidade de cedulas de 50
					resto50 = valor/50;						//divide o valor pela nota para saber quantas notas dar
					if(resto50 <= qtdCedula){				//verifica se tem o numero de cedulas	
						qtdCedula -= resto50;				//diminui o numero de cedulas da nota 50
						saque.setQtdCedula(qtdCedula);		//seta o novo numero de cedulas
						valor -= (resto50 * 50);			//diminui o valor para a proxima comparacao
						System.out.println(resto50 + " Notas de R$ 50,00"); //printa a qtd de notas que foi dada
					}
				}else if(((valor != 0) && (valor - 20) >= 0) && 
						((valor - 20) != 1) && ((valor - 20) != 3)){
					saque.getCedulaNome().equals("Nota20");
					qtdCedula  = saque.getQtdCedula();
					resto20 = valor / 20;
					if(resto20 <=qtdCedula)	{
						qtdCedula -= resto20;
						saque.setQtdCedula(qtdCedula);
						valor -= (resto20 * 20);
						System.out.println(resto20 + " Notas de R$ 20,00");
					}
				}else if((valor != 0) && ((valor - 10) >= 0) && 
						((valor - 10) != 1) && ((valor - 10) != 3)){
					saque.getCedulaNome().equals("Nota10");
					qtdCedula  = saque.getQtdCedula();
					resto10 = valor / 10;
					
					if(resto10 <=qtdCedula)	{
						qtdCedula -= resto10;
						saque.setQtdCedula(qtdCedula);
						valor -= (resto10 * 10);
						System.out.println(resto10 + " Notas de R$ 10,00");
					}
				}else if((valor != 0) && ((valor - 5) >= 0) && 
						((valor -5) != 1) && ((valor - 5) != 3)){
					saque.getCedulaNome().equals("Nota5");
					qtdCedula  = saque.getQtdCedula();
					resto5 = valor / 5;
					
					if(resto5 <=qtdCedula){
						qtdCedula -= resto5;
						saque.setQtdCedula(qtdCedula);
						valor -= (resto5 * 5);
						System.out.println(resto5 + " Notas de R$ 5,00");
					}
				}else if((valor != 0) && ((valor - 2) >= 0)){
					saque.getCedulaNome().equals("Nota2");
					qtdCedula  = saque.getQtdCedula();
					resto2 = valor / 2;
					
					if(resto2 <= qtdCedula){
						qtdCedula -= resto2;
						saque.setQtdCedula(qtdCedula);
						valor -= (resto2 * 2);
						System.out.println(resto2 + " Notas de 2");
					}
				}
			}else
				System.out.println("Não é possivel sacar");
		}	
	}
}		

