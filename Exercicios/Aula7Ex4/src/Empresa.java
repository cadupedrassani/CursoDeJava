
public class Empresa {

	private String nome;
	private int rg;
	private double salario;
	
	public Empresa() {}
	
	public Empresa(String nome, int rg) {
		this.nome = nome;
		this.rg = rg;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String imprimir(){
		String msg;
		msg = " Nome: " + nome + " RG: " + rg;
		return msg;
	}
}
