import java.util.Scanner;

public class Main {

public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		Moto moto = new Moto("Honda", "CBR", "Vermelha");
		moto.marcha(0);
		moto.marcha(0, 5);
		moto.marchaAcima(5);
		moto.marchaAbaixo(2);

		System.out.println(moto.imprimir());
	}
}
