package br.com.carlos.projetolocadora.modelo;

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
@Table(name = "filme")
public class Filme {
	
	@Id
	@Column(name = "cod_filme")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "ano")
	private Calendar ano;
	
	@Column(name = "resumo")
	private String resumo;
	
	@Column(name = "classificacao")
	private Integer classificao;
	
	@Column(name = "duracao")
	private Calendar duracao;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_categoria")
	private Categoria categoria;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "filme")
	private List<Midia> midias;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getAno() {
		return ano;
	}

	public void setAno(Calendar ano) {
		this.ano = ano;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public Integer getClassificao() {
		return classificao;
	}

	public void setClassificao(Integer classificao) {
		this.classificao = classificao;
	}

	public Calendar getDuracao() {
		return duracao;
	}

	public void setDuracao(Calendar duracao) {
		this.duracao = duracao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Midia> getMidias() {
		return midias;
	}

	public void setMidias(List<Midia> midias) {
		this.midias = midias;
	}
}
