package br.com.meta.aula14ex5;
import java.util.Scanner;

import br.com.meta.aula14ex5.testastring.TestaString;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			TestaString teste = new TestaString();
			teste.setPalavra1("as");
			teste.setPalavra2(null);
			System.out.println(teste.testaString());
		}
		catch (NullPointerException n ) {
			System.out.println("Valor não pode ser nulo");
			//n.printStackTrace();
		}
	}
}
