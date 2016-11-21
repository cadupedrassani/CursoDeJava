package br.com.meta.aula14ex8.verifica;

public class VerificaPalavra extends Exception{

	private static final long serialVersionUID = 1L;
	private String palavra;

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	public boolean verificaNumeroLetra(){
		for (int i = 0; i < palavra.length(); i++) {
			if (Character.isDigit(palavra.charAt(i))==true || 
					Character.isUpperCase(palavra.charAt(i))==true) {
				return true;
			}
		}
		return false;
	}	
}
