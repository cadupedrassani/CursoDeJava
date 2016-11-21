import java.util.ArrayList;

public class Casa {
	
	private String cor;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	private ArrayList<Porta> portas;

	public Casa (){
		portas = new ArrayList<Porta>();
	}
	
	public void AddPortas(Porta portas){
		this.portas.add(portas);
	}
	
	public void PintarCasa(String cor){
		this.cor = cor;
	}
	
	public int qtPortasAbertas(){
	
		int totalPortasAbertas = 0;
		
		for(Porta door : portas)
		{
			totalPortasAbertas++;
		}
		return totalPortasAbertas;
	}
	
	public int qtPortasFechadas(){
		int totalPortasFechadas = 0;
		
		for(Porta door : portas)
		{
			totalPortasFechadas++;
		}
		return totalPortasFechadas;
	}
	
	public String MostrarCasa(){
		String retorno = "Cor da casa: " + cor + "\nPortas Abertas: " + qtPortasAbertas()+ 
				"\nPortas Fechadas: " + qtPortasFechadas();
			return retorno;
		}
}
