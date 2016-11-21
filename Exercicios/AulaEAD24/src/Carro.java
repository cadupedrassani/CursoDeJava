
public class Carro {

	String marca;
	String modelo;
	int numPassageiro;
	double cpCombustivel;
	double consumoCombustivel;
	
	public void exibirAutonomia(){//sem retorno
		System.out.println("A autonomia do carro é:" + cpCombustivel * consumoCombustivel + "km");
	}
	
	public double obterAutonomia(){//com retorno
		return cpCombustivel * consumoCombustivel;
	}
	
	public double calcularCombustivel(double km){
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}
