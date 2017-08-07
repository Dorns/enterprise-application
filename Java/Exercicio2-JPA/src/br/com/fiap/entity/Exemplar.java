package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_EXEMPLAR")
@SequenceGenerator(name="seqExemplar", sequenceName="SQ_TB_EXEMPLAR", allocationSize=1)
public class Exemplar {
	
	@Id
	@Column(name="CD_EXEMPLAR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqExemplar")
	private int id;
	
	@Column(name="DT_AQUISICAO")
	@Temporal(TemporalType.DATE)
	private Calendar dt_aquisicao;
	
	@Column(name="CD_SITUACAO", nullable=false)
	private Situacao situacao;

	public Exemplar(int id, Calendar dt_aquisicao, Situacao situacao) {
		super();
		this.id = id;
		this.dt_aquisicao = dt_aquisicao;
		this.situacao = situacao;
	}

	public Exemplar() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDt_aquisicao() {
		return dt_aquisicao;
	}

	public void setDt_aquisicao(Calendar dt_aquisicao) {
		this.dt_aquisicao = dt_aquisicao;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
}
