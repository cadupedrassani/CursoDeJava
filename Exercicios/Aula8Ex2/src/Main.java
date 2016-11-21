import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		ContaCorrente contaC = new ContaCorrente();
		contaC.setSaldo(2000);
		contaC.atualizaReescrito();
		contaC.setTaxa(50);
		
		ContaPoupanca contaP = new ContaPoupanca();
		contaP.setSaldo(4000);
		contaP.setTaxa(50);
		contaP.atualizaReescrito();
		
		Conta[] contas = {contaC, contaP};
		
		for (Conta conta : contas){
			if(conta instanceof ContaCorrente){
				System.out.println(conta.imprimir());
				System.out.println("-----------------------");
			}
			if(conta instanceof ContaPoupanca){
				System.out.println(conta.imprimir());
				System.out.println("-----------------------");
			}
		}
	}
}