
public class Administrativos extends Empresa {

	private int horas;
	
	public Administrativos(String nome, int rg) {
		super(nome, rg);
	}
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double salarioTotal(){
		double aux;
		aux = (0.01 * getHoras()) + getSalario();
		return aux;
	}
	
	public String imprimir(){
		String msg = super.imprimir();
		msg += " Salario: " + salarioTotal();
		return msg;
	}
}