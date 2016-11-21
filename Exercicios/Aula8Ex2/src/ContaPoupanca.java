
public class ContaPoupanca extends Conta {
	
	public double atualizaReescrito(){
		double atualiza;
		atualiza = this.getTaxa() * 3;
		return atualiza;
	}
	
	public String imprimir(){
		String aux = super.imprimir();
		aux += " Conta poupan�a: " + (atualizaReescrito() + getSaldo() + getValorDeposito());
		return aux;
	}
}
