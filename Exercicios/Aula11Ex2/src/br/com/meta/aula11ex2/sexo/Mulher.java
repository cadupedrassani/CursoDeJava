package br.com.meta.aula11ex2.sexo;

import br.com.meta.aula11ex2.pessoa.PessoaIMC;

public class Mulher extends PessoaIMC{
	
	public Mulher(){}

	public Mulher(String nome, int dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String resultadoIMC() {
		String retorno = "";
		retorno += calcularIMC();
		if(calcularIMC() < 19){
			retorno += " Abaixo do peso ideal";
		}
		if(calcularIMC() > 19 && calcularIMC()< 25.8){
			retorno += " Peso ideal";
		}
		if(calcularIMC() > 25.8){
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
