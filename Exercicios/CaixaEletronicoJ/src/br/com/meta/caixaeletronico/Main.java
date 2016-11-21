package br.com.meta.caixaeletronico;
import java.math.BigDecimal;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

import br.com.meta.aula12ex1.banco.*;
import br.com.meta.aula12ex1.numero.Extenso;
import br.com.meta.caixaeletronico.cedula.Cedula;
import br.com.meta.aula12ex1.pessoa.*;

public class Main {

	static int opcao;
	static int opcao2;
	static int opcao3;
	static int opcao4;
	private static Scanner input;

	public static void main(String[] args) throws NumberFormatException {
		
		input = new Scanner(System.in);
	
		Administrador adm = new Administrador();
		CaixaEletronico caixa = new CaixaEletronico();
		Pessoa p = new Pessoa();
		Cliente c = new Cliente();
		Banco b = new Banco();
		
		do {
			System.out.println(" ______________________"  );
			System.out.println("|                      | ");
			System.out.println("|   ESCOLHA UMA OPCAO  | ");
			System.out.println("|______________________|" );
			System.out.println("\n(1) Administracao "
							 + "\n(2) Cliente "
							 + "\n(3) Cadastrar Cliente "
							 + "\n(4) Sair da aplicação ");						
			opcao = input.nextInt();
			input.nextLine();
			switch(opcao){
			case 1:
				System.out.print("Digite a senha: ");
				adm.setSenha(input.nextInt());
				System.out.print("Digite a conta: ");
				adm.setConta(input.nextInt());
				System.out.print("Digite a agencia: ");
				adm.setAgencia(input.nextInt());
				if(adm.verificarAcesso()== true){
					System.out.println("Login efetuado com sucesso");
					int op;
					do {
						System.out.println(" ______________________"  );
						System.out.println("|                      | ");
						System.out.println("|   ESCOLHA UMA OPCAO  | ");
						System.out.println("|______________________|" );
						System.out.println("\n(1) Cadastrar Administradores "
										 + "\n(2) Entrar "
										 + "\n(3) Retornar ao menu anterior ");
						op = input.nextInt();
						input.nextLine();
						switch (op){
						case 1:
							System.out.println("(1) Cadastrar");
							System.out.println("(0) Retornar");
							int op1 = input.nextInt();
							while(op1 != 0){
								System.out.println("Usuário:");
								p.setUser(input.nextInt());
								System.out.println("Senha:");
								p.setSenha(input.nextInt());
								b.addAdm(p);
								p = new Pessoa();
								System.out.println("(1) Cadastrar");
								System.out.println("(0) Retornar");
								op1 = input.nextInt();
							}
							break;
						case 2:
							System.out.print("Usuário: ");
							b.setUserLogin(input.nextInt());
							System.out.print("Senha: ");
							b.setSenhaLogin(input.nextInt());
							if(b.validarLoginAdm() == true){
								System.out.println("Login efetuado com sucesso");
								do {
									System.out.println(" ______________________"  );
									System.out.println("|                      | ");
									System.out.println("|   ESCOLHA UMA OPCAO  | ");
									System.out.println("|______________________|" );
									System.out.println("(1) Repor cedulas");
									System.out.println("(2) Consultar valor disponível e quantidade de cedulas");
									System.out.println("(3) Emitir extrato");
									System.out.println("(4) Esvaziar cédulas");
									System.out.println("(5) Aprovação de deposito");
									System.out.println("(6) Listar todos os clientes");
									System.out.println("(7) Retornar ao menu anterior");
									opcao2 = input.nextInt();
									input.nextLine();
									
									switch(opcao2){
									case 1:
										int valorNota;
										int qtdCedula;
										System.out.print("Digite o valor: ");
										valorNota = input.nextInt();
										System.out.print("Digite a quantidade: ");
										qtdCedula = input.nextInt();
										if (valorNota == 50){
											caixa.addCedulas(new Cedula("Nota50", 50, qtdCedula));
										}else if (valorNota == 20){
											caixa.addCedulas(new Cedula("Nota20", 20, qtdCedula));
										}else if (valorNota == 10){
											caixa.addCedulas(new Cedula("Nota10", 10, qtdCedula));
										}else if (valorNota == 5){
											caixa.addCedulas(new Cedula("Nota5", 5, qtdCedula));
										}else if (valorNota == 2){
											caixa.addCedulas(new Cedula("Nota2", 2, qtdCedula));
										}else 
											System.out.println("Cedula Invalida.");
										break;
									case 2:
										caixa.getQtdDeCadaCedula();
										System.out.println(caixa.getValorTotalDisponivel());
										break;
									case 3:
										break;
									case 4:
										int valor;
										int qtd;
										System.out.print("Digite o valor: ");
										valor = input.nextInt();
										System.out.print("Digite a quantidade: ");
										qtd = input.nextInt();
										caixa.removeCedulas(qtd);
										break;
									case 5:
										break;
									case 6:
										System.out.println(b.listarCadastros());
									}
								}while(opcao2 != 7);
							}else{
								System.out.println("Login ou conta/agência incorretos.");
							}
							break;
						}
					}while(op != 3);
					}else{
						System.out.println("Login ou conta/agência incorretos.");
				}
				break;					
			case 2:
				System.out.print("Digite a senha: ");
				b.setSenhaLogin(input.nextInt());
				System.out.print("Digite a conta: ");
				b.setContaLogin(input.nextInt());
				System.out.print("Digite a Agencia: ");
				b.setAgenciaLogin(input.nextInt());
				b.validarLogin();
				if(b.validarLogin()== true){
					System.out.println("Login efetuado com sucesso.");
					do{
						System.out.println(" ______________________"  );
						System.out.println("|                      | ");
						System.out.println("|   ESCOLHA UMA OPCAO  | ");
						System.out.println("|______________________|" );
						System.out.println("(1) Consultar Saldo");
						System.out.println("(2) Sacar");
						System.out.println("(3) Depositar");
						System.out.println("(4) Extrato");
						System.out.println("(5) Retornar ao menu anterior");
						opcao3 = input.nextInt();
						input.nextLine();
						switch (opcao3){
						case 1:
							//System.out.println(b.consultarSaldo());
							Extenso ex = new Extenso(new BigDecimal(b.consultarSaldo()));
						    System.out.println("Numero  : " + ex.DecimalFormat());
						    System.out.println("Extenso : " + ex.toString());
							break;
						case 2:
							System.out.println("Cedulas disponiveis para saque: ");
							System.out.println(caixa.cedulasDisponiveisSaque());
							System.out.println("Digite o valor para sacar: ");
							int valor = input.nextInt();
							caixa.saque(valor);
							break;
						case 3:
							break;
						case 4:
							break;
						}
					}while(opcao3 != 5);
				}else{
					System.out.println("Login ou conta/agência incorretos.");
				}
				break;
			case 3:
				System.out.println("(1) Cadastrar");
				System.out.println("(0) Retornar");
				int op = input.nextInt();
				while(op != 0){
					System.out.println("Nome:");
					p.setNome(input.next());
					System.out.println("Senha:");
					p.setSenha(input.nextInt());
					System.out.println("Conta:");
					p.setConta(input.nextInt());
					System.out.println("Agencia:");
					p.setAgencia(input.nextInt());
					System.out.println("Saldo:");
					p.setSaldo(input.nextDouble());
					b.addCliente(p);
					p = new Pessoa();
					System.out.println("(1) Cadastrar");
					System.out.println("(0) Retornar");
					op = input.nextInt();
				}
				break;
			}
		}while(opcao != 4);
	}
}