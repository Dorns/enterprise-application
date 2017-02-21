package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ApartamentoDAO;
import br.com.fiap.entity.Apartamento;

public class ApartamentoDAOImpl implements ApartamentoDAO {

	@Override
	public void create(Apartamento ap) {
		// Obter uma instancia da Fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		// Obter uma instancia do EntityManager
		EntityManager em = fabrica.createEntityManager();
		// Cadastrar apartamento
		em.persist(ap);
		// Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		// Fechando conexão
		em.close();
		System.out.println("Apartamento cadastrado!");
		System.exit(0);
	}

	@Override
	public Apartamento find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Apartamento ap) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}
}
