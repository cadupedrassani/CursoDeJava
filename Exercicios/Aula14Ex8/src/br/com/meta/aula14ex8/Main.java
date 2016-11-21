package br.com.meta.aula14ex8;

import java.util.Scanner;

import br.com.meta.aula14ex8.verifica.VerificaPalavra;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VerificaPalavra v = new VerificaPalavra();
		v.setPalavra("bbb");
		try{
			if(v.verificaNumeroLetra() == false){
				System.out.printf("Tudo certo: ");
				System.out.printf(v.getPalavra()+"\n");
				
			}
		}catch(VerificaPalavra a){
			System.out.printf("Possui números ou letras maiúsculas: ");
			System.out.printf(v.getPalavra()+"\n");
		}
	}
}
