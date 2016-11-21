package br.com.meta.aula8ex1.zoologico;
import java.util.ArrayList;

import br.com.meta.aula8ex1.animais.Animal;
import br.com.meta.aula8ex1.infra.Jaula;

public class Zoologico {
	
	private ArrayList<Jaula> jaulas;

	public Zoologico()
	{
		jaulas = new ArrayList<Jaula>();
	}
	
	public void addJaula(Jaula jaula) {
		this.jaulas.add(jaula);
	}
	
	public String verificarAnimais(){
		String retorno = "";
		for(Jaula jaula : jaulas)
		{
			Animal animal = jaula.getAnimal();
			retorno += "\n" + animal.dados() + "\nComportamento: " + 
			animal.comportamento() + "\n---------------------";
		}	
		return retorno;
	}
}
