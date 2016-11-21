import java.util.Scanner;

public class Main {
	
public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
				
		Vendedores vend = new Vendedores("Carlos", 1234567890);
		vend.setSalario(500);
		vend.setVendas(30);
		
		Administrativos adm = new Administrativos("Jose", 1324576809);
		adm.setSalario(1000);
		adm.setHoras(20);
		
		Empresa[] funcionarios = {vend, adm};

		for (Empresa emp : funcionarios){
			if(emp instanceof Vendedores){
			System.out.println(emp.imprimir());
			}
			if(emp instanceof Administrativos){
				System.out.println(emp.imprimir());
			}
		}
	}
}

