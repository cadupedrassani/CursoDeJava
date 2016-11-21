package br.com.meta.aula14ex5.testastring;

public class TestaString {

	String palavra1;
	String palavra2;
	
	public String getPalavra1() {
		return palavra1;
	}
	public void setPalavra1(String palavra1) {
		this.palavra1 = palavra1;
	}
	public String getPalavra2() {
		return palavra2;
	}
	public void setPalavra2(String palavra2) {
		this.palavra2 = palavra2;
	}
	
	public String testaString(){
		String ret = "";
		if(palavra1.length() > palavra2.length()){
			ret += "Maior";
		}else if(palavra1.length() < palavra2.length()){
			ret += "Menor";
		}else{
			ret += "Iguais";
		}
		return ret;
	}
}
