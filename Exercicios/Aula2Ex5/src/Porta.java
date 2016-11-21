
public class Porta {

	private boolean aberta;
	private String cor;
	
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void AbrirPorta(){
		aberta = true;
	}
	public void FecharPorta(){
		aberta = false;
	}
	
	public String EstaAberta(){
		String mansagem;
		if (aberta == true){
			mansagem = "Aberta";
		} else{
			mansagem = "Fechada";
		}
	return mansagem;
	}
	
	public String MostrarPorta(){
	String retorno = "Porta: " + EstaAberta();
	return retorno;

	}
}
