
public class Ingresso {
	
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String imprimir(){
		String msg;
		msg = "Valor: " + getValor();
		return msg;
	}
}
