
public class Vendedores extends Empresa {

	public double salario;
	public int vendas;
	
	public Vendedores(String nome, int rg) {
		super(nome, rg);
	}	

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	public double salarioTotal(){
		double aux;
		aux = (5 * getVendas()) + getSalario();
		return aux;
	}
	
	public String imprimir(){
		String msg = super.imprimir();
		msg += " Salario: " + salarioTotal();
		return msg;
	}
	
}
