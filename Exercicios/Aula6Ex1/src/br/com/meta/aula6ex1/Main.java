package br.com.meta.aula6ex1;

import java.util.Scanner;
import br.com.meta.aula6ex1.banco.*;

public class Main {
	
	public static void main(String[] args)
	{
		boolean continuar = true;

		Scanner input = new Scanner(System.in);
		
		Administrador user = new Administrador();

		Cedula notaDe50 = new Cedula();
		notaDe50.setTipoCedula(50);
		notaDe50.setQtdCedula(30);
		
		Cedula notaDe20 = new Cedula();
		notaDe20.setTipoCedula(20);
		notaDe20.setQtdCedula(25);
		
		Cedula notaDe10 = new Cedula();
		notaDe10.setTipoCedula(10);
		notaDe10.setQtdCedula(20);
		
		Cedula notaDe5 = new Cedula();
		notaDe5.setTipoCedula(5);
		notaDe5.setQtdCedula(15);
		
		Cedula notaDe2 = new Cedula();
		notaDe2.setTipoCedula(2);
		notaDe2.setQtdCedula(10);
		
		//add as notas na array
		Caixa caixa = new Caixa();
		caixa.addCedulas(notaDe50);
		caixa.addCedulas(notaDe20);
		caixa.addCedulas(notaDe10);
		caixa.addCedulas(notaDe5);
		caixa.addCedulas(notaDe2);
		
		caixa.setValorCaixa(3000);
		
		do{//inicia o laço de opçoes
			System.out.println("|    Escolha uma das opções   |");
			System.out.println("-------------------------------");      
			System.out.println("|1 - Entrar como Cliente      |");
			System.out.println("|2 - Entrar como Administrador|");
			System.out.println("|3 - Sair                     |");
			int opcao = input.nextInt();

			switch (opcao){//switch de opcoes do cliente
			case 1:
				System.out.println(caixa.mostrarCedula());
				System.out.println("Informe o valor a ser sacado:");
				caixa.setValorSaque((input.nextDouble()));
		        
		        //faz a verificação se é possivel sacar e mostra o novo saldo
		        if(caixa.getValorSaque() <= caixa.getValorCaixa() && caixa.getValorSaque()> 0){
		        	System.out.println("Sacado: " + caixa.getValorSaque());
					System.out.println(caixa.sacar());
		        }else
		        	System.out.println("Impossivel Sacar");
		        break;
		        
			case 2:
				System.out.println("Informe a senha de Administrador");
				user.setSenha(input.nextInt());
				
				//verifica se a senha de adm esta correta
				System.out.println(user.verificaSenha() ? "Senha correta" : "Senha incorreta");
				if(user.verificaSenha()== true){
					do{
						System.out.println("|    Escolha uma das opções    |");      
						System.out.println("--------------------------------");      
						System.out.println("|1 - Ver valor total disponível|");
						System.out.println("|2 - Ver quantidade de cédulas |");
						System.out.println("|3 - Adicionar mais cédulas    |");
						System.out.println("|4 - Sair                      |");
						int opcao1 = input.nextInt();
						
						switch (opcao1){//switch de opcoes do adm
						case 1: 
							System.out.println("Valor total disponível: " + caixa.getValorCaixa());
						break;
						
						case 2:	
							System.out.println(caixa.mostrarQtdCedulas());
						break;
						
						case 3:
							System.out.println("|Quantas cedulas você quer repor?|");
							caixa.reporCedula(input.nextInt());
						break;
						
						case 4: 
							continuar = false;
							break;
						}
					}while(continuar);
				}else
					System.out.println("Não está logado."); 
			break;
			case 3:
				continuar = false;
			break;
			}
		}while(continuar);
	}
}