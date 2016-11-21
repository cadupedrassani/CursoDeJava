import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		boolean continuar = true;
		
		Scanner input = new Scanner(System.in);		
		
		Contato contato = new Contato();
		Agenda agenda = new Agenda();
		
		do{
			System.out.println(".---------Agenda-------.");
			System.out.println("|1 - Adicionar contato |");
			System.out.println("|2 - Listar contatos   |");
			System.out.println("|3 - Pesquisar contato |");
			System.out.println("|4 - Editar contato    |");
			System.out.println("|5 - Remover contato   |");
			System.out.println("|0 - Sair              |");
			int opcao = (input.nextInt());
			
			switch(opcao){
			case 1:
				System.out.println("Digite o nome: ");
				contato.setNome(input.next());
				System.out.println("Digite o telefone: ");
				contato.setTelefone(input.nextInt());
				agenda.addContato(contato);
				break;
			case 2:
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 0:
				continuar = false;
                System.out.println("Você saiu da Agenda.");
				break;
			}
		} while(continuar);
	}
}