import java.util.ArrayList;

public class Edificio {
	
	private String cor;

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	private ArrayList<Porta> portas;
	private ArrayList<Andar> andares;

	public Edificio (){
		portas = new ArrayList<Porta>();
		andares = new ArrayList<Andar>();
	}
	public void addPortas(Porta portas){
		this.portas.add(portas);
	}
	
	public ArrayList<Porta> getPortas()
	{
		return portas;
	}
	
	public void addAndares(Andar andares){
		this.andares.add(andares);
	}
	
	public void pintarEdificio(String cor){
		this.cor = cor;
	}
	
	public int qtPortasAbertas(){
	
		int totalPortasAbertas = 0;
		
		for(Porta door : portas)
		{
			if(door.isAberta())
				totalPortasAbertas++;
		}
		return totalPortasAbertas;
	}
	
	public int qtPortasFechadas(){
		int totalPortasFechadas = 0;
		
		for(Porta door : portas)
		{
			if(!door.isAberta())
				totalPortasFechadas++;
		}
		return totalPortasFechadas;
	}
	
	public int qtdPortas(){
		int totalPortas = 0;
		totalPortas = qtPortasAbertas() + qtPortasFechadas();
		return totalPortas;
	}
	
	public int totalAndares(){
		int totaldeAndares = 0;
		
		for(Andar and : andares){
			totaldeAndares++;
		}
		return totaldeAndares;
	}

	public String mostrarEdificio(){
		String retorno = "Cor do edificio: " + cor + "\nQuantidade de portas: " + qtdPortas() +
				"\nPortas Abertas: " + qtPortasAbertas()+ "\nPortas Fechadas: " + qtPortasFechadas() +
				 "\nTotal de andares: " + totalAndares();
		return retorno;
	}
}
