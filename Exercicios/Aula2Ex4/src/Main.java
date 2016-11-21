import java.util.Scanner;


public class Main {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
				
		Estoque estoque1 = new Estoque();
		estoque1.setNome("Impressora");
		estoque1.setQtdAtual(13);
		estoque1.setQtdMinima(6);
		estoque1.darBaixa(0);
		System.out.println((estoque1.precisaRepor()) ? "Precisa repor" : "Nao precisa repor");
		System.out.println(estoque1.mostra());

		Estoque estoque2 = new Estoque();
		estoque2.setNome("Monitor");
		estoque2.setQtdAtual(11);
		estoque2.setQtdMinima(13);
		estoque2.repor(0);
		System.out.println((estoque2.precisaRepor()) ? "Precisa repor" : "Nao precisa repor");
		System.out.println(estoque2.mostra());

		Estoque estoque3 = new Estoque();
		estoque3.setNome("Mouse");
		estoque3.setQtdAtual(6);
		estoque3.setQtdMinima(2);
		estoque3.darBaixa(0);
		System.out.println((estoque3.precisaRepor()) ? "Precisa repor" : "Nao precisa repor");
		System.out.println(estoque3.mostra());
		
	}
}
