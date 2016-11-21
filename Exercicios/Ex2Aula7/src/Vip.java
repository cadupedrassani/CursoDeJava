
public class Vip extends Ingresso {
	
	private double valorAdc;
	
	public double getValorAdc() {
		return valorAdc;
	}

	public void setValorAdc(double valorAdc) {
		this.valorAdc = valorAdc;
	}

	public double valorAdicional(){
		double valor = (this.getValor() + getValorAdc());
		return valor;
	}
	
	@Override
	public String imprimir(){
		String msg;
		msg = "Ingresso vip. Valor: " + valorAdicional();
		return msg;
	}

}
