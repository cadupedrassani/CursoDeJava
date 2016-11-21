import java.util.ArrayList;

public class Posto {

	private ArrayList<Bico> bicos;

	public Posto (){
		bicos = new ArrayList<Bico>();
	}
	
	public void AddBicos(Bico bico){
		this.bicos.add(bico);
	}
	
	public float calcularTotal(){

		float valortotal = 0;
		
		for(Bico bico : bicos)
		{
			valortotal += bico.CalcularValor();
		}
		
		if(valortotal > 70)
			valortotal *= 0.9;
		
		return valortotal;
	}
}
	

