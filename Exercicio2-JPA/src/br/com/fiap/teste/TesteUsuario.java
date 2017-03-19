package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.dao.impl.UsuarioDAOImpl;
import br.com.fiap.entity.Usuario;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteUsuario {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		Usuario usuario = new Usuario(0, "Dorns", "Felipe", "Dornelas Viel", "12456789-0");

		UsuarioDAO dao = new UsuarioDAOImpl(em);

		dao.create(usuario);
		try {
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		} finally {
			em.close();
			System.out.print("Usuario cadastrado com sucesso!");
			System.exit(0);
		}
	}
}