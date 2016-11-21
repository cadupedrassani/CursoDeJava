package br.com.meta.aula11ex2;

import java.util.Calendar;
import java.util.Scanner;

import br.com.meta.aula11ex2.pessoa.*;
import br.com.meta.aula11ex2.sexo.*;

public class Main {

	public static void main(String[] args) {
		
		boolean continuar = true;

		Scanner input = new Scanner(System.in);

		Calendar c = Calendar.getInstance();
		//Pessoa pessoa = new Pessoa();
		Homem homem = new Homem();
		Mulher mulher = new Mulher();
		
		do{
			System.out.println("1 - Homem");
			System.out.println("2 - Mulher");
			System.out.println("3 - Sair");
			int opcao = (input.nextInt());
			switch (opcao){
			case 1:
				System.out.println("Digite o seu nome: ");
				homem.setNome(input.next());
				System.out.println("Digite a data de nascimento: ");
				homem.setDataNascimento(input.nextInt());
				System.out.println("Digite o seu peso: ");
				homem.setPeso(input.nextDouble());
				System.out.println("Digite a sua altura: ");
				homem.setAltura(input.nextDouble());
				System.out.println(homem.imprimir());
				//System.out.println(homem.imprimir());
			break;
			case 2:
				System.out.println("Digite o seu nome: ");
				mulher.setNome(input.next());
				System.out.println("Digite a data de nascimento: ");
				mulher.setDataNascimento(input.nextInt());
				System.out.println("Digite o seu peso: ");
				mulher.setPeso(input.nextDouble());
				System.out.println("Digite a sua altura: ");
				mulher.setAltura(input.nextDouble());
				System.out.println(mulher.imprimir());
			break;
			case 3:
				continuar = false;
			}
		}while (continuar);	
	}
}
