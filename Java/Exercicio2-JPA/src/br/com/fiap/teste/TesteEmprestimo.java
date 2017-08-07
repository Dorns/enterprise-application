package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EmprestimoDAO;
import br.com.fiap.dao.impl.EmprestimoDAOImpl;
import br.com.fiap.entity.Emprestimo;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteEmprestimo {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		Emprestimo emprestimo = new Emprestimo(0, new GregorianCalendar(2017, Calendar.MARCH, 17), new GregorianCalendar(2017, Calendar.MARCH, 19));

		EmprestimoDAO dao = new EmprestimoDAOImpl(em);

		dao.create(emprestimo);
		try {
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		} finally {
			em.close();
			System.out.print("Emprestimo realizado com sucesso!");
			System.exit(0);
		}
	}
}