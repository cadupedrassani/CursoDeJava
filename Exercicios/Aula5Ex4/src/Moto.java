
public class Moto {

	private String marca;
	private String modelo;
	private String cor;
	private int marcha;
	
	public Moto(String marca, String modelo, String cor, int marcha) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = marcha;
	}
	
	public String imprimir(){
		String mensagem = "Marca: " + marca + "\nModelo: " + modelo + 
				"\nCor: " + cor + "\nMarcha: " + marcha;		
		return mensagem;
	}
}
