import java.util.ArrayList;

public class Caixa {
	
	private String tipoCedula;
	private int qtdCedula;
	private double valorCaixa;
	private double valorSaque;
	
	private ArrayList<Caixa> cedulas;

	public Caixa()
	{
		cedulas = new ArrayList<Caixa>();
	}
	
	public void addCedulas(Caixa cedulas) {
		
		this.cedulas.add(cedulas);
	}
	
	public int getQtdCedula() {
		return qtdCedula;
	}

	public void setQtdCedula(int qtdCedula) {
		this.qtdCedula = qtdCedula;
	}

	public String getTipoCedula() {
		return tipoCedula;
	}

	public void setTipoCedula(String tipoCedula) {
		this.tipoCedula = tipoCedula;
	}

	public double getValorCaixa() {
		return valorCaixa;
	}

	public void setValorCaixa(double valorCaixa) {
		this.valorCaixa = valorCaixa;
	}

	public double getValorSaque() {
		return valorSaque;
	}

	public void setValorSaque(double valorSaque) {
		this.valorSaque = valorSaque;
	}

	public double sacar(){
		double aux;
        if(valorCaixa >= valorSaque){
        	aux = this.valorCaixa -= valorSaque;
        } else {
            aux = this.valorCaixa = valorCaixa;
        }
        return aux;
    }
	
	/*public void reporNotas(int qtd50, int qtd20, int qtd10, int qtd5, int qtd2){
		this.notasDe50 += qtd50;
		this.notasDe20 += qtd20;
		this.notasDe10 += qtd10;
		this.notasDe5 += qtd5;
		this.notasDe2 += qtd2;
	}
	
	public String mostrarQtdNotas(){
		String aux;
		
		aux = "Quantidade de cédulas disponíveis: ";
		if(getTipoCedula() == "Nota de 50"){
			aux += (getQtdCedula() + getTipoCedula());
		}else 
			aux += "";
		if(getTipoCedula() == "Nota de 20"){
			aux += (getQtdCedula() + getTipoCedula());
		}else 
			aux += "";
		if(getTipoCedula() == "Nota de 10"){
			aux += (getQtdCedula() + getTipoCedula());
		}else 
			aux += "";
		if(getTipoCedula() == "Nota de 5"){
			aux += (getQtdCedula() + getTipoCedula());
		}else 
			aux += "";
		if(getTipoCedula() == "Nota de 2"){
			aux += (getQtdCedula() + getTipoCedula());
		}else 
			aux += "";
		
		return aux;
	}
	
	public String mostrarNotas(){
		String aux;
		
		aux = "Notas disponíveis: ";
		if(getTipoCedula() == "Nota de 50"){
			aux += ("50 - ");
		}else 
			aux += "";
		if(getTipoCedula() == "Nota de 20"){
			aux += (" 20 - ");
		}else 
			aux += "";
		if(getTipoCedula() == "Nota de 10"){
			aux += (this.getTipoCedula());
		}else 
			aux += "";
		if(getTipoCedula() == "Nota de 5"){
			aux += (this.getTipoCedula());
		}else 
			aux += "";
		if(getTipoCedula() == "Nota de 2"){
			aux += (this.getTipoCedula());
		}else 
			aux += "";
		
		return aux;
	}*/
}
