package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AutorDAO;
import br.com.fiap.dao.impl.AutorDAOImpl;
import br.com.fiap.entity.Autor;
import br.com.fiap.entity.Sexo;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteAutor {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		Autor autor = new Autor (0, "Affonso", Sexo.MASCULINO, "Solano", new GregorianCalendar(1981, Calendar.NOVEMBER, 13));
		
		AutorDAO dao = new AutorDAOImpl(em);
		
		dao.create(autor);
		try {
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		}finally{
			em.close();
			System.out.print("Autor cadastrado com sucesso!");
			System.exit(0);
		}
	}
}
