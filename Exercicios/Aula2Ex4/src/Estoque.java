
public class Estoque {

	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdAtual() {
		return qtdAtual;
	}
	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	public int getQtdMinima() {
		return qtdMinima;
	}
	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	public void mudarNome(String nome){
		nome = "Teclado";
	}
	public void mudarQtdMinima(int qtdMinima){
		this.qtdMinima = qtdMinima;
	}
	public void repor(int qtd){
		qtdAtual = qtd + qtdAtual;
	}
	public boolean darBaixa(int qtd){
		if (!temSaldo(qtd))
			return false;
			
		qtdAtual = qtdAtual - qtd;
		return true;		
	}
	
	public boolean temSaldo(int qtd)
	{
		return (qtdAtual > 0 && qtdMinima > 0 && (qtdAtual - qtd) > 0 );
	}
	
	public String mostra(){
		String retorno = "Nome: "+ nome + " Quantidade Atual: " + 
	qtdAtual + " Quantidade Mínima: " + qtdMinima;
		
		return retorno;
	}
	
	public boolean precisaRepor(){
		return (qtdAtual <= qtdMinima);
	}
}
