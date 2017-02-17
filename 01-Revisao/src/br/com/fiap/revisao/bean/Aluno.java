package br.com.fiap.revisao.bean;

import java.util.Calendar;

public class Aluno {

	public Aluno() {
		super();
	}

	public Aluno(int rm, Calendar dataNascimento, String nome, Sexo sexo) {
		super();
		this.rm = rm;
		this.dataNascimento = dataNascimento;
		this.nome = nome;
		this.sexo = sexo;
	}

	private int rm;
	
	private Calendar dataNascimento;
	
	private String nome;
	
	private Sexo sexo;

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
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
	
}
