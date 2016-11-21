package br.com.meta.aula12ex1.banco;

import java.util.ArrayList;

import br.com.meta.aula12ex1.pessoa.Cliente;
import br.com.meta.aula12ex1.pessoa.Pessoa;

public class Banco {

	private int senhaLogin;
	private int contaLogin;
	private int agenciaLogin;
	private int userLogin;
	
	
	protected ArrayList<Pessoa> clientes;
	protected ArrayList<Pessoa> adms;

	public Banco(){
		clientes = new ArrayList<Pessoa>();
		adms = new ArrayList<Pessoa>();
	}
	public void addCliente(Pessoa cliente) {
		this.clientes.add(cliente);
	}
	public void addAdm(Pessoa adm) {
		this.adms.add(adm);
	}
	
	public int getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(int userLogin) {
		this.userLogin = userLogin;
	}
	public int getSenhaLogin() {
		return senhaLogin;
	}
	public void setSenhaLogin(int senhaLogin) {
		this.senhaLogin = senhaLogin;
	}
	public int getContaLogin() {
		return contaLogin;
	}
	public void setContaLogin(int contaLogin) {
		this.contaLogin = contaLogin;
	}
	public int getAgenciaLogin() {
		return agenciaLogin;
	}
	public void setAgenciaLogin(int agenciaLogin) {
		this.agenciaLogin = agenciaLogin;
	}
	
	
	public String listarCadastros() {
		String ret = "";
		if (clientes.size() == 0) {
			ret += "\nNão existem cadastros\n";
		} else {
			ret += "\nLista de Cadastros\n";
			for (int i = 0; i < clientes.size(); i++) {
				Pessoa p = clientes.get(i);
				ret += "Cadastro número: " + i;
				ret += "\tNome: " + p.getNome();
				ret += "\tSenha: " + p.getSenha();
				ret += "\tConta: " + p.getConta();
				ret += "\tAgencia: " + p.getAgencia();
				ret += "\tSaldo: " + p.getSaldo() + "\n";
			}
			ret += "\nFim da lista\n";
		}
		return ret;
	}
	public boolean validarLogin(){
		for (int i = 0; i < this.clientes.size(); i++) {
			Pessoa p = clientes.get(i);
			if(p.getSenha() == getSenhaLogin() && 
					p.getAgencia() == getAgenciaLogin() && 
					p.getConta() == getContaLogin()){
				return true;
			}
		}
		return false;
	}
	public boolean validarLoginAdm(){
		for (int i = 0; i < this.adms.size(); i++) {
			Pessoa p = adms.get(i);
			if(p.getSenha() == getSenhaLogin() && 
					p.getUser() == getUserLogin()){
				return true;
			}
		}
		return false;
	}
	public double consultarSaldo(){
		double aux = 0;
		for (int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getSenha() == getSenhaLogin()
					&& clientes.get(i).getConta() == getContaLogin()
					&& clientes.get(i).getAgencia() == getAgenciaLogin()){
				aux = clientes.get(i).getSaldo();
			}
		}
		return aux;
	}
}
