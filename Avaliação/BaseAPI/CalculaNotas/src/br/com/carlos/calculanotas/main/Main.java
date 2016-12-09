package br.com.carlos.calculanotas.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.carlos.calculanotas.nota.Nota;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		Nota nota = new Nota();
		try {
			System.out.printf("Informe o Valor: ");
			nota.setValor(ler.nextDouble());
			System.out.printf(nota.calculaNota(nota.getValor()));
			System.out.printf(nota.calculaMoeda(nota.getValor()));
			}catch (InputMismatchException e) {
	    		System.err.printf("\nErro: dados informados inválidos !!!\n");
	    	}
	}
}
