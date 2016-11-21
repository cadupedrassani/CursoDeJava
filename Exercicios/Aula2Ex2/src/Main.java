import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		Lampada lampada = new Lampada();
		lampada.desligar();
		lampada.ligar();
		lampada.ObservaStatus();
		System.out.println(lampada.ObservaStatus() ? "Ligada" : "Desligada");
	}
}
