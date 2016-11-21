
public class CamaroteSup extends Vip {

	private double valorCamarteSup;
	
	public double getValorCamarteSup() {
		return valorCamarteSup;
	}
	public void setValorCamarteSup(double valorCamarteSup) {
		this.valorCamarteSup = valorCamarteSup;
	}
	public double valorTotal(){
		double valor = valorAdicional() + getValorCamarteSup();
		return valor;
	}
	public String imprimir(){
		String msg;
		msg = "Ingresso vip. Valor: " + valorAdicional() + 
				"\nCamarote superior. Valor: " + getValorCamarteSup() + 
				"\nTotal de: " + valorTotal();
		return msg;
	}
}
