package br.com.carlos.calculanotas.nota;

import java.text.DecimalFormat;

public class Nota {
	
    private String moeda = "", real = "";
    private int i;
    private int vlr;
    private int quantidade;
	double valor;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	// definindo as notas do troco (parte inteira)
	public String calculaNota(double valor) {
		
		int nota[] = {100, 50, 20, 10, 5, 2, 1};
		
		DecimalFormat formatador = new DecimalFormat("###,##0.00");
		real += "\nValor = R$"+ formatador.format(valor) +"\n\n";
	    
		vlr = (int)valor;
	    i = 0;
	    while (vlr != 0) {
	      quantidade = vlr / nota[i]; // calculando a qtde de notas
	      if (quantidade != 0) {
	         real += (quantidade +" nota(s) de R$"+ nota[i] +" real(is)\n");
	         vlr = vlr % nota[i]; // sobra
	      }
	      i = i + 1; // próxima nota
	    }
	    real += "\n";
	    return(real);
	}
	
	public String calculaMoeda(double valor) {
		int centavos[] = {50, 25, 10, 5, 1};
	    vlr = (int) valor;
	    vlr = (int)Math.round((valor - (int)valor) * 100);
        i = 0;
        
        while (vlr != 0) {
          quantidade = vlr / centavos[i]; // calculando a qtde de moedas
          if (quantidade != 0) {
             moeda += (quantidade +" moeda(s) de "+ centavos[i] + " centavo(s)\n");
             vlr = vlr % centavos[i]; // sobra
          }
          i = i + 1; // próximo centavo
        }
        moeda += "\n";
	    return(moeda);
	}
}