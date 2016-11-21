package br.com.meta.aula14ex2.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.meta.aula14ex2.numeros.Numero;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);		
		int op = 0;
		do {
			try {
				Numero nr = new Numero();
				System.out.println("Dividendo:");
				nr.setNumero1(input.nextInt());
				System.out.println("Divisor:");
				nr.setNumero2(input.nextInt());
				double aux = nr.divide(nr.getNumero1(),nr.getNumero2());
				System.out.printf("Resultado: %.2f\n", aux);
				System.out.println("(1) Continuar");
				System.out.println("(0) Sair ");
				op = input.nextInt();
			}
			catch (ArithmeticException a ) {
				System.out.println(a.getMessage());
				System.out.println("(1) Continuar");
				System.out.println("(0) Sair ");
				op = input.nextInt();
				//a.printStackTrace();
			}
			catch (InputMismatchException i) {
				System.out.println("Digite apenas números.\n");
				input.nextLine();
				System.out.println("(1) Continuar");
				System.out.println("(0) Sair ");
				op = input.nextInt();
			}
		} while (op != 0);
	}
		
}
