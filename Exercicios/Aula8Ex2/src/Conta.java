
public class Conta {
	
	public double saldo;
	public double taxa;
	public double valorSaque;
	public double valorDeposito;
	
	public double getValorSaque() {
		return valorSaque;
	}
	public void setValorSaque(double valorSaque) {
		this.valorSaque = valorSaque;
	}
	public double getValorDeposito() {
		return valorDeposito;
	}
	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public void pegarSaldo(){
		getSaldo();
	}
	
	public void depositar(){
		this.saldo += getValorDeposito();
	}
	
	public void sacar(){
		this.saldo -= getValorSaque();
	}
	
	public void atualizaConta(){
		this.saldo += getTaxa();
	}
	
	public String imprimir(){
		String aux;
		aux = "Valor depositado: " + getValorDeposito() +
				" Saldo atual: " + getSaldo();
		return aux;
	}
	
}
