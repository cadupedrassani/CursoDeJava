
public class Retangulo {
	
	private double comprimento;
	private double largura;
	private double area;
	private double perimetro;
	
	public Retangulo(double comprimento, double largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public void setDados(double area){
		this.area = area;
	}
	
	public void setDados(double comprimento, double largura){
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public void setDados(double comprimento, double largura, double area){
		this.comprimento = comprimento;
		this.largura = largura;
		this.area = area;
	}
	
	public void setDados(double comprimento, double largura, double area, double perimetro){
		this.comprimento = comprimento;
		this.largura = largura;
		this.area = area;
		this.perimetro = perimetro;
	}
	
	public double calcularArea(){
		this.area = (comprimento * largura);; 
		return area;
	}
	
	public double calcularPerimetro(){
		this.perimetro = (comprimento * comprimento) + (largura * largura);
		return perimetro;
	}
	
	public void calculaTotal(){
		calcularPerimetro();
		calcularArea();
	}
	
	public String imprimir(){
		String mensagem;
		return mensagem = "Comprimento: " + comprimento + "\nLargura: " + largura + 
				"\nArea: " + area + "\nPerimetro: " + perimetro;
	}
}
