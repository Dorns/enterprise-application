package br.com.fiap.bean;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.annotation.Tabela;

@Tabela("TAB_ALUNO")
public class Aluno extends Pessoa {
	
	@Coluna(nome="CD_ALUNO")
	private int rm;
	
	@Coluna(nome="NM_CURSO")
	private String curso;
	
	@Override
	public void andar() {
		System.out.println("Aluno andando..");
	}
	
}