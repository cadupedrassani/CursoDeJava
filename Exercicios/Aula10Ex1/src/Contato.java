
public class Contato extends Agenda {

	private String nome;
	private int telefone;
	
	public Contato(){}
	
	public Contato(String nome, int telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String imprimir(){
		String s = getNome() + "\n";
		return s;
    }
}
