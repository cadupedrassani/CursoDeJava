
public class ContatoBasico extends Contato {

	public int cpf;
	
	public ContatoBasico(String nome, int telefone, int cpf) {
		super(nome, telefone);
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
