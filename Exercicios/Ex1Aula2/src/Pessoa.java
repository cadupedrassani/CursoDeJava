
public class Pessoa {
	
	private String nome;
	private float idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getIdade() {
		return idade;
	}
	public void setIdade(float idade) {
		this.idade = idade;
	}
	public void fazAniversario(){
		idade +=1;
	}
	public String mostrarDados(){
		String mensagem = "Nome: " + nome + " Idade: " + idade;
		return mensagem;
	}
}
