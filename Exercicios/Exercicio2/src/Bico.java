
public class Bico {

	private Combustivel combustivel;
	private double qtdCombustivel;
	
	public Combustivel getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}
	public double getQtdCombustivel() {
		return qtdCombustivel;
	}
	public void setQtdCombustivel(double qtdCombustivel) {
		this.qtdCombustivel = qtdCombustivel;
	}

	public double CalcularValor(){
		
		double valortotal = 0;
		
		if(qtdCombustivel <= 10){
			valortotal = qtdCombustivel * combustivel.getValor();
		}
		else{
			valortotal = qtdCombustivel * combustivel.getValorDesconto();
		}
		
		return valortotal;
	}
}
