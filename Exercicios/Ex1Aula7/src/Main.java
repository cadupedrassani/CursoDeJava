import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("1 - Imovel Novo");
		System.out.println("2 - Imovel Velho");
		int opcao = input.nextInt();
		
		Novo novo = new Novo();
		novo.setPreco(2000);
		novo.setEndereco("Recanto Maestro");
		novo.setPrecoAdicional(1000);
		
		Velho velho = new Velho();
		velho.setPreco(2000);
		velho.setEndereco("Recanto Maestro");
		velho.setPrecoDesconto(1000);

		switch (opcao){
		case 1:
			System.out.println(novo.imprimir());
			break;
		case 2:
			System.out.println(velho.imprimir());
			break;
		}
	}
}
