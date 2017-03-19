package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
@SequenceGenerator(name="seqUsuario", sequenceName="SEQ_TB_USUARIO", allocationSize=1)
public class Usuario {
	
	@Id
	@Column(name="CD_USUARIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqUsuario")
	private int id;
	
	@Column(name="NM_NICK_USUARIO", nullable=false)
	private String nomeUsuar;
	
	@Column(name="NM_NOME_USUARIO", nullable=false, length=300)
	private String nome;
	
	@Column(name="NM_SOBRENOME", length=300)
	private String sobrenome;
	
	@Column(name="CD_CPF", nullable=false, length=20)
	private String cpf;

	public Usuario(int id, String nomeUsuar, String nome, String sobrenome, String cpf) {
		super();
		this.id = id;
		this.nomeUsuar = nomeUsuar;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public Usuario() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeUsuar() {
		return nomeUsuar;
	}

	public void setNomeUsuar(String nomeUsuar) {
		this.nomeUsuar = nomeUsuar;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
