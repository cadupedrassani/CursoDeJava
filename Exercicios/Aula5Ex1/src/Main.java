import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Jo�o");
		pessoa.setEndereco("Recanto Maestro");
		pessoa.setNumeroTel(96393496);

		
		System.out.println(pessoa.imprimir());
	}
}
