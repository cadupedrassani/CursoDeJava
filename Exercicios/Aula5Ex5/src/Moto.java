
public class Moto {

	private String marca;
	private String modelo;
	private String cor;
	private int marcha;
	private int menorMarcha;
	private int maiorMarcha;
	
	public Moto(String marca, String modelo, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public void marcha(int marcha){
		this.marcha = marcha;
	}
	
	public void marcha(int menorMarcha, int maiorMarcha){
		this.menorMarcha = menorMarcha;
		this.maiorMarcha = maiorMarcha;
	}
	
	public void marchaAcima(){
		this.marcha++;
	}
	
	public int marchaAcima(int qtdMarcha){
		if((marcha + qtdMarcha) >= menorMarcha && (marcha + qtdMarcha) <= maiorMarcha){	
			return this.marcha = marcha+qtdMarcha;
		}else{
			return marcha;
		}
	}
	
	public void marchaAbaixo(){
		this.marcha--;
	}
	
	public int marchaAbaixo(int qtdMarcha){
		if((marcha - qtdMarcha) > menorMarcha && (marcha - qtdMarcha) <= maiorMarcha){	
			return this.marcha = marcha-qtdMarcha;
		}else{
			return marcha;
		}
	}
	
	public String imprimir(){
		String mensagem = "Marca: " + marca + "\nModelo: " + modelo + 
				"\nCor: " + cor;
			if(marcha == 0){
				return mensagem += "\nMarcha: Neutra";
			}else if(marcha == 1){
				return mensagem += "\nMarcha: Primeira";
			}else if(marcha == 2){
				return mensagem += "\nMarcha: Segunda";
			}else if(marcha == 3){
				return mensagem += "\nMarcha: Terceira";
			}else if(marcha == 4){
				return mensagem += "\nMarcha: Quarta";
			}else if(marcha == 5){
				return mensagem += "\nMarcha: Quinta";
			}
		return mensagem;
	}
}