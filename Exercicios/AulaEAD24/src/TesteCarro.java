
public class TesteCarro {

	public static void main(String[] args){
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.cpCombustivel = 100;
		van.consumoCombustivel = 0.4;
		
		System.out.println("Autonomia do carro é:" + van.obterAutonomia());//com retorno
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.print("qtdCombustivel10:" + qtdCombustivel10);
		System.out.print("\nqtdCombustivel15:" + qtdCombustivel15);
	}
}
