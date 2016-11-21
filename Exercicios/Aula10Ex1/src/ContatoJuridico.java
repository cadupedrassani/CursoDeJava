
public class ContatoJuridico extends Contato {

	private int cnpj;

	public ContatoJuridico(String nome, int telefone, int cnpj) {
		super(nome, telefone);
		this.cnpj = cnpj;
	}
	
	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public boolean validarCnpj(){
		return true;
	}
}
