package br.com.meta.aula14ex2.numeros;

public class Numero {

	private int numero1;
	private int numero2;
	private double resultado;
	
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public double divide(double dividendo, double divisor) throws ArithmeticException{
	    if(divisor == 0)
	        throw new ArithmeticException("O divisor nao pode ser 0.\n");
	    return dividendo/divisor;
	}
}
