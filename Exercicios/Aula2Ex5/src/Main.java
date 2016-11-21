import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
			
		Main main = new Main();
		
		Andar andar1 = new Andar();
		andar1.setNumeroAndar(1);
		Andar andar2 = new Andar();
		andar2.setNumeroAndar(2);
		Andar andar3 = new Andar();
		andar3.setNumeroAndar(3);
		Andar andar4 = new Andar();
		andar3.setNumeroAndar(4);
		
		Edificio edir = new Edificio();
		edir.setCor("Branco");
		edir.addPortas(main.retornaPorta(true));
		edir.addPortas(main.retornaPorta(true));
		edir.addPortas(main.retornaPorta(false));
		edir.addPortas(main.retornaPorta(true));
		edir.addPortas(main.retornaPorta(false));
		edir.addPortas(main.retornaPorta(true));
		edir.addAndares(andar1);
		edir.addAndares(andar2);
		edir.addAndares(andar3);
		edir.addAndares(andar4);
		
		for(Porta porta : edir.getPortas())
		{
			System.out.println(porta.MostrarPorta());	
		}
		
		System.out.println(edir.mostrarEdificio());
	}
	
	public Porta retornaPorta(boolean portaAberta)
	{
		Porta porta = new Porta();
		if(portaAberta)
			porta.AbrirPorta();
		else
			porta.FecharPorta();
		
		return porta;
	}
}
