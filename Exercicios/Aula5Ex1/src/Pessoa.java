
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
	
	public String imprimir(){
		String mensagem = "Nome: " + nome + "  Endere�o: " + endereco + "  Numero telefone: " + numeroTel; 
		return mensagem;
	}
	
}
