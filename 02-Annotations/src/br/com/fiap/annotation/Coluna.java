package br.com.fiap.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//É possível recuperar a anotação até a execução
@Retention(RetentionPolicy.RUNTIME)
//Anotação serve para atributos
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Coluna {

	String nome();
	
}
