
public class Imovel {
	
	private double preco;
	private String endereco;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String imprimir(){
		String msg;
		msg = "Valor total com desconto: " + getPreco() + " Endereço: " + getEndereco();
		return msg;
	}
}
