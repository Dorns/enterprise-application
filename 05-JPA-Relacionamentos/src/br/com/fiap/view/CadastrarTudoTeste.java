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
import fiap.com.br.entity.Aluno;
import fiap.com.br.entity.Disciplina;
import fiap.com.br.entity.GrupoAm;
import fiap.com.br.entity.ProjetoAm;

public class CadastrarTudoTeste {
	public static void main(String[] args) {
		//Cadastrar os Alunos, Grupo, Projeto e Disciplinas
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		GrupoAmDAO grupoDao = new GrupoAmDAOImpl(em);
		ProjetoAmDAO prj = new ProjetoAmDAOImpl(em);
		
		GrupoAm grupo = new GrupoAm();
		grupo.setNome("X");
		
		grupo.addAluno(new Aluno(0,"Felipe"));
		grupo.addAluno(new Aluno(0,"Allana"));
		grupo.addAluno(new Aluno(0,"Carlos"));
		grupo.addAluno(new Aluno(0,"Lucas"));
		
		Disciplina dis = new Disciplina(0, "Teste", 10, grupo.getAlunos());
		Disciplina dis2 = new Disciplina(0, "Teste2", 10, grupo.getAlunos());
		
		ProjetoAm projeto = new ProjetoAm(0, new GregorianCalendar(2017,Calendar.APRIL,1), "Tema x", "obs x", 10, grupo);
		
		try {
			prj.create(projeto);
			grupoDao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0);
		}
		
	}
}
