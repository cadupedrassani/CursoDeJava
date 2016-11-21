import java.util.Scanner;

public class Lampada {
	
	Scanner input = new Scanner(System.in);

	boolean ligada;
	
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	void ligar(){
		ligada = true;
	}
	void desligar(){
		ligada = false;
	}
	public boolean ObservaStatus(){
		return (ligada == true);
		}	
	}
