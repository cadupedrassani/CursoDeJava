
public class ContaCorrente extends Conta {
	
	public double atualizaReescrito(){
		double atualiza;
		atualiza = this.getTaxa() * 2;
		return atualiza;
	}
	
	public void depositar(){
		this.saldo += (getValorDeposito() - 0.10);
	}

	public String imprimir(){
		String aux = super.imprimir();
		aux += " Conta corrente: " + (atualizaReescrito() + getSaldo() + getValorDeposito());
		return aux;
	}	
}
