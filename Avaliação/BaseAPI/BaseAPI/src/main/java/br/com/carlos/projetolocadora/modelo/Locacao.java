package br.com.carlos.projetolocadora.modelo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "locacao")
public class Locacao {

	@Id
	@Column(name = "cod_locacao")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_cliente")
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_funcionario")
	private Funcionario funcionario;
	
	@Column(name = "data_emprestimo")
	private Calendar emprestimo;

	@Column(name = "data_devolucao")
	private Calendar devolucao;
	
	@Column(name = "observacao")
	private String observacao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locacao")
	private List<LocacaoMidia> locacoesMidias;
	
	@Column(name = "valor")
	private BigDecimal valor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Calendar getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Calendar emprestimo) {
		this.emprestimo = emprestimo;
	}

	public Calendar getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Calendar devolucao) {
		this.devolucao = devolucao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<LocacaoMidia> getLocacoesMidias() {
		return locacoesMidias;
	}

	public void setLocacoesMidias(List<LocacaoMidia> locacoesMidias) {
		this.locacoesMidias = locacoesMidias;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
