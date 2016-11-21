import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa("João", "Recanto Maestro", 96393496);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getNumeroTel());
	}
}
