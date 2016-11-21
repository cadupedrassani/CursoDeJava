
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		
		Usuario user = new Usuario();

		Caixa notaDe50 = new Caixa();
		notaDe50.setTipoCedula("50 -");
		notaDe50.setQtdCedula(30);
		
		Caixa notaDe20 = new Caixa();
		notaDe20.setTipoCedula(" 20 -");
		notaDe20.setQtdCedula(25);
		
		Caixa notaDe10 = new Caixa();
		notaDe10.setTipoCedula(" 10 -");
		notaDe10.setQtdCedula(20);
		
		Caixa notaDe5 = new Caixa();
		notaDe5.setTipoCedula(" 5 -");
		notaDe5.setQtdCedula(15);
		
		Caixa notaDe2 = new Caixa();
		notaDe2.setTipoCedula(" 2");
		notaDe2.setQtdCedula(10);
		
		Caixa caixa = new Caixa();
		caixa.addCedulas(notaDe50);
		caixa.addCedulas(notaDe20);
		caixa.addCedulas(notaDe10);
		caixa.addCedulas(notaDe5);
		caixa.addCedulas(notaDe2);
		
		caixa.setValorCaixa(3000);
		
		System.out.println("|    Escolha uma das opções   |");      
		System.out.println("-------------------------------");      
		System.out.println("|1 - Entrar como Cliente      |");
		System.out.println("|2 - Entrar como Administrador|");
		int opcao = input.nextInt();

		switch (opcao){
		case 1:
			System.out.println("Notas disponiveis: " + notaDe50.getTipoCedula() + 
					notaDe20.getTipoCedula() + notaDe10.getTipoCedula() + 
					notaDe5.getTipoCedula() + notaDe2.getTipoCedula());
			System.out.println("Informe o valor a ser sacado:");
	        caixa.setValorSaque(input.nextDouble());
	        
	        if(caixa.getValorSaque() <= caixa.getValorCaixa() && caixa.getValorSaque()> 0){
	        	System.out.println("Sacado: " + caixa.getValorSaque() + "\nNovo saldo: " + caixa.sacar());	        	
	        }else
	        	System.out.println("Impossivel Sacar");
	        break;
		case 2:
			System.out.println("Informe a senha de Administrador");
			user.setSenha(input.nextInt());
			System.out.println(user.verificaSenha() ? "Senha correta" : "Senha incorreta");
			
			if(user.verificaSenha()== true){
				System.out.println("|    Escolha uma das opções    |");      
				System.out.println("--------------------------------");      
				System.out.println("|1 - Ver valor total disponível|");
				System.out.println("|2 - Ver quantidade de cédulas |");
				System.out.println("|3 - Adicionar mais cédulas    |");
				int opcao1 = input.nextInt();
	
				switch (opcao1){
				case 1: 
					System.out.println("Valor total disponível: " + caixa.getValorCaixa());
				break;
				case 2:	
					//System.out.println(caixa.mostrarQtdNotas());
					break;
				case 3:	
					//caixa.reporNotas(5, 5, 5, 5, 5);
					//caixa.reporNotas(5, 5, 5, 5, 5);
					//System.out.println(caixa.mostrarQtdNotas());
					break;
				}
			}else
				System.out.println("Não está logado."); 
			break;
		}
		
	}        			
}
