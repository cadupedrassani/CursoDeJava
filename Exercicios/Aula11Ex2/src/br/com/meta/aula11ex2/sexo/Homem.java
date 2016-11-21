package br.com.meta.aula11ex2.sexo;

import br.com.meta.aula11ex2.pessoa.PessoaIMC;
import java.text.DecimalFormat;   

public class Homem extends PessoaIMC{

	public Homem(String nome, int dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
	}

	public Homem() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String resultadoIMC(){
		String retorno = "";
		retorno += calcularIMC();
		if(calcularIMC() < 20.7){
			retorno += " Abaixo do peso ideal";
		}
		if(calcularIMC() > 20.7 && calcularIMC()< 26.4){
			retorno += " Peso ideal";
		}
		if(calcularIMC() > 26.4){
			retorno += " Acima do peso";
		}
		return retorno;
	}
	
	public String imprimir(){
		String ret = super.imprimir();
		ret += "\nResultado: " + resultadoIMC();
		return ret;
	}

}
