
public class Novo extends Imovel {
	
	private double precoAdicional;

	public double getPrecoAdicional() {
		return precoAdicional;
	}

	public void setPrecoAdicional(double precoAdicional) {
		this.precoAdicional = precoAdicional;
	}
	
	public double valorAdicional(){
		double valor = (this.getPreco() + getPrecoAdicional());
		return valor;
	}
	
	public void valorTotal(){
		valorAdicional();
	}
	
	public String imprimir(){
		String msg;
		msg = "Valor total com desconto: " + valorAdicional() + " Endereço: " + getEndereco();
		return msg;
	}
}
