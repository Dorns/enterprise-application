package br.com.fiap.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ProjetoAmDAO;
import br.com.fiap.dao.impl.ProjetoAmDAOImpl;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;
import fiap.com.br.entity.Aluno;
import fiap.com.br.entity.Disciplina;
import fiap.com.br.entity.GrupoAm;
import fiap.com.br.entity.ProjetoAm;

public class CadastrarTudoTeste {
	public static void main(String[] args) {
		// Cadastrar os Alunos, Grupo, Projeto e Disciplinas
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		GrupoAm grupo = new GrupoAm(0, "NaturaGroup", null);

		ProjetoAm projeto = new ProjetoAm(0, new GregorianCalendar(2017, Calendar.OCTOBER, 2), "Naturalize", "Nenhuma",
				10, grupo);

		grupo.addAluno(new Aluno("Allana"));
		grupo.addAluno(new Aluno("Carlos"));
		grupo.addAluno(new Aluno("Felipe"));
		grupo.addAluno(new Aluno("Lucas"));
		grupo.addAluno(new Aluno("Rodrigo"));

		List<Disciplina> disciplina = new ArrayList<>();

		disciplina.add(new Disciplina("IOT", 80));
		disciplina.add(new Disciplina("Enterprise", 160));
		disciplina.add(new Disciplina("Digital", 160));
		disciplina.add(new Disciplina("Android", 80));
		disciplina.add(new Disciplina("IOs", 80));

		// Setar as disciplinas nos alunos
		for (Aluno aluno : grupo.getAlunos()) {
			aluno.setDisciplinas(disciplina);
		}
		
		//É necessario setar o lado que nao tem o mappedBy
		for(Disciplina disc : disciplina){
			disc.setAlunos(grupo.getAlunos());
		}

		ProjetoAmDAO dao = new ProjetoAmDAOImpl(em);

		try {
			dao.create(projeto);
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		} finally {
			em.close();
			System.exit(0);
		}
	}
}
