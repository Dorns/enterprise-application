package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;
import fiap.com.br.entity.Aluno;
import fiap.com.br.entity.GrupoAm;

public class CadastroGrupoAlunoTeste {
	public static void main(String[] args) {
		//Instanciar o Entity Manager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Instanciar o DAO
		GrupoAmDAO dao = new GrupoAmDAOImpl(em);
		
		//Instanciar o Grupo
		GrupoAm grupo = new GrupoAm();
		grupo.setNome("Grupo");
		
		//Instanciar os Alunos
		//Adicionar ou alunos no grupo
		grupo.addAluno(new Aluno(0, "Felipe"));
		grupo.addAluno(new Aluno(0, "Marcos"));
		grupo.addAluno(new Aluno(0, "Milton"));
		
		//Cadastrar com commit!
		try {
			dao.create(grupo);
			//Sucesso!
			dao.commit();
			System.out.println("Grupo criado com sucesso!");
		} catch (CommitErrorException e) {
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0);
		}
	}
}
