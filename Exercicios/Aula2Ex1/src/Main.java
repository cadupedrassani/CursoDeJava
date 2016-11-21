import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Joao");
		pessoa.setIdade(11);
		
		pessoa.fazAniversario();
		pessoa.fazAniversario();
		System.out.println(pessoa.mostrarDados());
	}
}
