
public class Velho extends Imovel {

	private double precoDesconto;

	public double getPrecoDesconto() {
		return precoDesconto;
	}

	public void setPrecoDesconto(double precoDesconto) {
		this.precoDesconto = precoDesconto;
	}
	
	public double valorDesconto(){
		double valor = this.getPreco() - getPrecoDesconto();
		return valor;
	}
	
	public String imprimir(){
		String msg;
		msg = "Valor total com desconto: " + valorDesconto() + " Endereço: " + getEndereco();
		return msg;
	}
}
