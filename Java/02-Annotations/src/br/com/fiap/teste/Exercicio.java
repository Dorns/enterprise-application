package br.com.fiap.teste;

import br.com.fiap.annotation.Tabela;
import br.com.fiap.bean.Aluno;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar o aluno
		Aluno aluno = new Aluno();
		//Recuperar a anotação @Tabela
		Tabela anotacao = aluno.getClass()
				.getAnnotation(Tabela.class);
		//Imprimir o SELECT
		System.out.println("SELECT * FROM " 
							+ anotacao.value());
	}
	
}
