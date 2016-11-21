package br.com.meta.aula8ex1.infra;
import br.com.meta.aula8ex1.animais.Animal;

public class Jaula {
	
	private Animal animal;
	private int qtdAnimais;

	public Jaula(Animal animal, int qtdAnimais) {
		this.animal = animal;
		this.qtdAnimais = qtdAnimais;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public int getQtdAnimais() {
		return qtdAnimais;
	}
	public void setQtdAnimais(int qtdAnimais) {
		this.qtdAnimais = qtdAnimais;
	}
}
