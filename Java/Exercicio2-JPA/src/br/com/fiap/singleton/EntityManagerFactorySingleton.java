package br.com.fiap.singleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	private EntityManagerFactorySingleton(){};

	private static EntityManagerFactory fabrica;
	
	public static EntityManagerFactory getInstance(){
		
		if (fabrica==null){
			fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return fabrica;
	}
	
}
