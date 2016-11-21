import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("1 - Ingresso Normal");
		System.out.println("2 - Ingresso Vip");
		int opcao = (input.nextInt());
		
		switch (opcao){
		case 1:
			Normal normal = new Normal();
			normal.setValor(50);
			System.out.println(normal.imprimir());			
			break;							
		case 2:
			Vip vip = new Vip();
			vip.setValor(50);
			vip.setValorAdc(50);
			System.out.println(vip.imprimir());
			System.out.println("1 - Camarote Superior");
			System.out.println("2 - Camarote Inferior");
			int opcao1 = (input.nextInt());
				switch (opcao1){
				case 1:
					CamaroteSup camaroteSup = new CamaroteSup();
					camaroteSup.setValor(50);
					camaroteSup.setValorAdc(50);
					camaroteSup.setValorCamarteSup(50);
					System.out.println(camaroteSup.imprimir());
					break;
				case 2:
					CamaroteInfe camaroteInfe = new CamaroteInfe();
					camaroteInfe.setValor(50);
					camaroteInfe.setValorAdc(50);
					System.out.println(camaroteInfe.imprimir());
				}
			break;
		}
	}
}
