package br.com.fiap.view;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.DependenteDAO;
import br.com.fiap.dao.impl.DependenteDAOImpl;
import br.com.fiap.entity.Dependente;
import br.com.fiap.entity.Funcionario;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class View {
	public static void main(String[] args) {
		// Cadastrar um funcionário e um dependete
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		DependenteDAO dao = new DependenteDAOImpl(em);

		Funcionario func = new Funcionario("Felipe", new GregorianCalendar(1995, 1, 10),2500.5,1385,6589);

		Dependente dep = new Dependente(func, "Maria");
		
		try {
			dao.create(dep);
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
	}
}
