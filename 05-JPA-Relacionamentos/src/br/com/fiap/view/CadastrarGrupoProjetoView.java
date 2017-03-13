package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.ProjetoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.dao.impl.ProjetoAmDAOImpl;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;
import fiap.com.br.entity.GrupoAm;
import fiap.com.br.entity.ProjetoAm;

public class CadastrarGrupoProjetoView {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		// Intanciar os DAOs
		GrupoAmDAO grupoDao = new GrupoAmDAOImpl(em);	
		ProjetoAmDAO projetoDao = new ProjetoAmDAOImpl(em);
		
		// Instanciar um grupo e um projeto
		GrupoAm grupo = new GrupoAm(0, "GRUPOx");
		ProjetoAm projeto = new ProjetoAm(0, new GregorianCalendar(1999, Calendar.JANUARY, 23), "tema", "dsadsa", 8.5f,
				grupo);
		
		//Utilizar dao para cadastrar
		grupoDao.create(grupo);
		projetoDao.create(projeto);
	
		try {
			//Commit
			projetoDao.commit();
			//Sucesso!
		} catch (CommitErrorException e) {
			e.printStackTrace();
		} finally {
			em.close();
			System.exit(0); //Fecha o programa
		}
	}
}
