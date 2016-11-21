import java.util.Scanner;

public class Main {

public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		Moto moto = new Moto("Honda", "CBR", "Vermelha", 2);
		
		System.out.println(moto.imprimir());
	}
}
