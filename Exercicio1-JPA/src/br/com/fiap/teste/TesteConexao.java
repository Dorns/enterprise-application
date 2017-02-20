package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteConexao {

	public static void main(String[] args) {
		// Obter uma instancia da Fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		// Obter uma instancia do EntityManager
		EntityManager em = fabrica.createEntityManager();
	}
}
