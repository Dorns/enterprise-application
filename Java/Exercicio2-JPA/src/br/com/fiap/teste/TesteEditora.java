package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EditoraDAO;
import br.com.fiap.dao.impl.EditoraDAOImpl;
import br.com.fiap.entity.Editora;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteEditora {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		Editora editora = new Editora(0, "123456/0001-3", "Editora Teste", "Rua do teste, 392");

		EditoraDAO dao = new EditoraDAOImpl(em);

		dao.create(editora);
		try {
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		} finally {
			em.close();
			System.out.print("Editora cadastrada com sucesso!");
			System.exit(0);
		}
	}
}