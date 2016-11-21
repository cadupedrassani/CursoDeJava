
public class Letra {

	public boolean ehVogal(String letra){
		if(letra == "A" || letra == "E" || letra == "I" || letra == "O" || letra == "U"){
			return true;
		}else return false;
	}
	
	public boolean ehConsoante(String letra){
		if(!(letra == "A") || !(letra == "E") || !(letra == "I") || !(letra == "O") || !(letra == "U")){
			return true;
		}else return false;
	}
	
	public String retornaVogalOuConsoante(String letra){
		String mensagem;
		if(ehVogal(letra) == true){
				return mensagem = "A letra é vogal";
		}else return mensagem = "A letra é consoante";
	}
}
