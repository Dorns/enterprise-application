package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ExemplarDAO;
import br.com.fiap.dao.impl.ExemplarDAOImpl;
import br.com.fiap.entity.Exemplar;
import br.com.fiap.entity.Situacao;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteExemplar {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		Exemplar exemplar = new Exemplar(0, new GregorianCalendar(2017, Calendar.MARCH, 17), Situacao.EMPRESTADO);

		ExemplarDAO dao = new ExemplarDAOImpl(em);

		dao.create(exemplar);
		try {
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		} finally {
			em.close();
			System.out.print("Exemplar cadastrado com sucesso!");
			System.exit(0);
		}
	}
}