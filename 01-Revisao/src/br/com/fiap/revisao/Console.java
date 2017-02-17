package br.com.fiap.revisao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.revisao.bean.Aluno;
import br.com.fiap.revisao.bean.Sexo;

public class Console {

	public static void main(String[] args) {
		//Declarar uma variável para armazenar uma data
		Calendar inicioDasAulas;
		//Adicionar uma data na variável (data atual)
		inicioDasAulas = Calendar.getInstance();
		//Outra variavel de data				    
		Calendar terminoDasAulas = 			//ano, mes (começa no 0) e dia
								new GregorianCalendar(2017,Calendar.JUNE,1);
		
		//Formatação de data
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Começo: " 
				+ formatador.format(inicioDasAulas.getTime()));
		System.out.println("Término: " 
				+ formatador.format(terminoDasAulas.getTime()));
		
		//Instanciar um aluno
		Aluno aluno = new Aluno(76146,
				new GregorianCalendar(1998,Calendar.JANUARY,24),
				"Rafa",
				Sexo.MASCULINO);
		
		//Comparar o sexo do aluno
		if (aluno.getSexo() == Sexo.MASCULINO){
			System.out.println("Homem");
		}else{
			System.out.println("Mulher");
		}
		
	}
	
}
