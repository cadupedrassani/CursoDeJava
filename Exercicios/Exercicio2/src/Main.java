import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{				
		Scanner input = new Scanner(System.in);
	
		System.out.println("Digite a quantidade de alcool abastecida:");
		int qtdAlcool = input.nextInt();
		
		Combustivel alcool = new Combustivel();
		alcool.setNomeCombustivel("Alcool");
		alcool.setValor(2.57);
		alcool.setValorDesconto(2.10);
		
		Bico bicoAlcool = new Bico();
		bicoAlcool.setCombustivel(alcool);
		bicoAlcool.setQtdCombustivel(qtdAlcool);
	
		System.out.println("Digite a quantidade de gasolina abastecida");
		int qtdGasolina = input.nextInt();		
		
		Combustivel gasolina = new Combustivel();
		gasolina.setNomeCombustivel("Gasolina");
		gasolina.setValor(3.39);
		gasolina.setValorDesconto(3.39);
		
		Bico bicoGasolina = new Bico();
		bicoGasolina.setCombustivel(gasolina);
		bicoGasolina.setQtdCombustivel(qtdGasolina);
		
		Posto posto = new Posto();
	    posto.AddBicos(bicoGasolina);
	    posto.AddBicos(bicoAlcool);
		
        System.out.println("Total a pagar: " + posto.calcularTotal());

	}	
}