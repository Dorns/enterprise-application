package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CidadeDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.CidadeDAOImpl;
import br.com.fiap.entity.Cidade;

public class ConsoleView4 {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		CidadeDAO dao = new CidadeDAOImpl(em);

		List<Cidade> cidades = dao.buscarPorEstado("SP");

		for (Cidade cidade : cidades) {
			System.out.println(cidade.getNome() + " " + cidade.getUf());
		}

		em.close();
		System.exit(0);
	}
}
