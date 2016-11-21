package br.com.meta.aula8ex1;
import br.com.meta.aula8ex1.animais.*;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.meta.aula8ex1.animais.Anfibio;
import br.com.meta.aula8ex1.animais.Ave;
import br.com.meta.aula8ex1.animais.Mamifero;
import br.com.meta.aula8ex1.infra.Jaula;
import br.com.meta.aula8ex1.zoologico.Zoologico;

public class Main {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		Anfibio tubarao = new Anfibio("Tubarão", 300, 0, "Cinza", 1.5, "Mar", "Glub glub");
		Mamifero urso = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", 0.5, "Terra", "Mel", "Urrrgh");
		Ave canario = new Ave("Canário", 15, 2, "Laranja", 2.0, "Ar", "Piu piu");
		Anfibio lambari = new Anfibio("Lambari", 15, 0, "Cinza", 1.5, "Rios e Lagos", "Glu glu");
		Mamifero cachorro = new Mamifero("Cachorro", 50, 4, "Preto", 2.0, "Terra", "Ração", "Au au");
		Ave beijaFlor = new Ave("Beija Flor", 10, 2, "Amarelo", 2.0, "Ar", "Zzzzz");
		Mamifero vaca = new Mamifero("Vaca", 100, 4, "Branco", 1.0, "Terra", "Pasto", "Muuuuu");
		
		Jaula jaula1 = new Jaula(tubarao, 7);
        Jaula jaula2 = new Jaula(urso, 6);        
        Jaula jaula3 = new Jaula(canario, 5);        
        Jaula jaula4 = new Jaula(lambari, 4);        
        Jaula jaula5 = new Jaula(cachorro, 3);
        Jaula jaula6 = new Jaula(beijaFlor, 2);
        Jaula jaula7 = new Jaula(vaca, 1);
        
		Zoologico zoo = new Zoologico();
		zoo.addJaula(jaula1);
		zoo.addJaula(jaula2);
		zoo.addJaula(jaula3);
		zoo.addJaula(jaula4);
		zoo.addJaula(jaula5);
		zoo.addJaula(jaula6);
		zoo.addJaula(jaula7);

		System.out.println(zoo.verificarAnimais());
	}
}
