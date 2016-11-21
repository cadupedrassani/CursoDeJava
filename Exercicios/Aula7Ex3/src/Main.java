import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		Animal camelo = new Animal("Camelo", 1.5, 4, "Amarelo", "Terra", 2.0);
		camelo.alteraAmbiente("Deserto");
				
		Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinza", "Mar", 1.5);
		tubarao.alteraNome("Lambari");
		tubarao.alteraAmbiente("Rio");
		
		Mamifero urso = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", 0.5, "Terra");
		urso.setAlimento(" Mel");
		urso.alteraComprimento(220);
		urso.alteraCor("Preto");
		
		Animal[] animais = new Animal[3];
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = urso;
		        
		System.out.println("-----------------------");
		for (Animal animal : animais){
			System.out.println(animal.dados());
			System.out.println("-----------------------");
		}
	}
}
