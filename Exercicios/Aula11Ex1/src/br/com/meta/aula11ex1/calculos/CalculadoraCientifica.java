package br.com.meta.aula11ex1.calculos;

public class CalculadoraCientifica extends Calculadora{

	private float valor1;
	private float valor2;
	
	public float getValor1() {
		return valor1;
	}
	public void setValor1(float valor1) {
		this.valor1 = valor1;
	}
	
	public float getValor2() {
		return valor2;
	}
	public void setValor2(float valor2) {
		this.valor2 = valor2;
	}
	
	@Override
	public float somar() {
		float aux;
		aux = valor1 + valor2;
		return aux;
	}
	
	@Override
	public float subtrair() {
		float aux;
		aux = valor1 - valor2;
		return aux;
	}
	
	@Override
	public float dividir() {
		float aux;
		aux = valor1 / valor2;
		return aux;
	}
	
	@Override
	public float multiplicar() {
		float aux;
		aux = valor1 * valor2;
		return aux;
	}
	
	public float raizQuadrada(){
		return (float) Math.sqrt(valor1);
	}
	
	public float potencia(){
		return (float) Math.pow(valor1, valor2);
	}
	
	public String imprimir(){
		String retorno = "";
		retorno += "Soma: " + somar() + " Subtração: " + subtrair() + 
				" Divisão: " + dividir() + " Multiplicação: " + multiplicar();
		return retorno;
	}
	
	public String imprimirRaiz(){
		String retorno = "";
		retorno += " Raiz: " + raizQuadrada();
		return retorno;
	}
	
	public String imprimirPotencia(){
		String retorno = "";
		retorno += " Potência: " + potencia();
		return retorno;
	}
	
}
