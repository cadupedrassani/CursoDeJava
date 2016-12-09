package br.com.carlos.projetolocadora.modelo;

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
@Table(name = "midia")
public class Midia {

	@Id
	@Column(name = "cod_midia")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_filme")
	private Filme filme;
	
	@Column(name = "inutilizada")
	private Boolean inutilizada;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_tipo_midia")
	private TipoMidia tipoMidia;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "midia")
	private List<LocacaoMidia> locacoesMidias;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Boolean getInutilizada() {
		return inutilizada;
	}

	public void setInutilizada(Boolean inutilizada) {
		this.inutilizada = inutilizada;
	}

	public TipoMidia getTipoMidia() {
		return tipoMidia;
	}

	public void setTipoMidia(TipoMidia tipoMidia) {
		this.tipoMidia = tipoMidia;
	}

	public List<LocacaoMidia> getLocacoesMidias() {
		return locacoesMidias;
	}

	public void setLocacoesMidias(List<LocacaoMidia> locacoesMidias) {
		this.locacoesMidias = locacoesMidias;
	}
}
