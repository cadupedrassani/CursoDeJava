
public class Pessoa {

	private String nome;
	private String endereco;
	private int numeroTel;
	
		public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}
	
	public Pessoa(String nome, String endereco, int numeroTel) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.numeroTel = numeroTel;
		
	}
}
