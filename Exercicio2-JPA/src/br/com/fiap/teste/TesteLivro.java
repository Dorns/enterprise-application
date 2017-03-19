package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.entity.Livro;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteLivro {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		Livro livro = new Livro(0, "Espadachim de carvao", 25.00f, new GregorianCalendar(2015, Calendar.FEBRUARY, 10), null);

		LivroDAO dao = new LivroDAOImpl(em);

		dao.create(livro);
		try {
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		} finally {
			em.close();
			System.out.print("Livro cadastrado com sucesso!");
			System.exit(0);
		}
	}
}