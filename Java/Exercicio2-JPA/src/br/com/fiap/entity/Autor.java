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
@Table(name = "TB_AUTOR")
@SequenceGenerator(name = "seqAutor", sequenceName = "SEQ_TB_AUTOR", allocationSize = 1)
public class Autor {
	@Id
	@Column(name = "CD_AUTOR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAutor")
	private int id;

	@Column(name = "NM_NOME", nullable = false, length = 300)
	private String nome;

	@Column(name = "NR_SEXO", nullable = false)
	private Sexo sexo;

	@Column(name = "NM_SOBRENOME", nullable = false)
	private String sobrenome;

	@Column(name = "DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar dt_nascimento;

	public Autor(int id, String nome, Sexo sexo, String sobrenome, Calendar dt_nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.sobrenome = sobrenome;
		this.dt_nascimento = dt_nascimento;
	}

	public Autor() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
}
