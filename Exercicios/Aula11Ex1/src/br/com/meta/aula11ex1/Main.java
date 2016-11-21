package br.com.meta.aula11ex1;

import java.util.Scanner;

import br.com.meta.aula11ex1.calculos.CalculadoraCientifica;

public class Main {

	public static void main(String[] args) {
		
		boolean continuar = true;
		
		Scanner input = new Scanner(System.in);	
		
		CalculadoraCientifica calculadora = new CalculadoraCientifica();
		
		do{
			System.out.println(".------Calculadora-----.");
			System.out.println("|1 - Operações basicas |");
			System.out.println("|2 - Raiz quadrada     |");
			System.out.println("|3 - Potenciação       |");
			System.out.println("|4 - Sair              |");
			int opcao = (input.nextInt());
			
			switch(opcao){
			case 1:
				System.out.println("Digite o primeiro valor: ");
				calculadora.setValor1(input.nextFloat());
				System.out.println("Digite o segundo valor: ");
				calculadora.setValor2(input.nextFloat());
				System.out.println(calculadora.imprimir());
			break;
			case 2:
				System.out.println("Digite o valor: ");
				calculadora.setValor1(input.nextFloat());
				System.out.println(calculadora.imprimirRaiz());	
			break;
			case 3:
				System.out.println("Digite o valor base: ");
				calculadora.setValor1(input.nextFloat());
				System.out.println("Digite o valor expoente: ");
				calculadora.setValor2(input.nextFloat());
				System.out.println(calculadora.imprimirPotencia());
			break;
			}
		}while(continuar);
	}
}
