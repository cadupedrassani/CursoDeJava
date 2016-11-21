import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		Retangulo ret = new Retangulo(5.5, 6.7);
		
		ret.calculaTotal();
		System.out.println(ret.imprimir());
	}
}
