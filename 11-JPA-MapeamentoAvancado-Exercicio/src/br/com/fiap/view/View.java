package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaCorrenteDAO;
import br.com.fiap.dao.ContaPoupancaDAO;
import br.com.fiap.dao.impl.ContaCorrenteDAOImpl;
import br.com.fiap.dao.impl.ContaPoupancaDAOImpl;
import br.com.fiap.entity.Agencia;
import br.com.fiap.entity.ContaCorrente;
import br.com.fiap.entity.ContaPoupanca;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class View {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		ContaCorrenteDAO cCorrente = new ContaCorrenteDAOImpl(em);
		
		ContaPoupancaDAO cPoupanca = new ContaPoupancaDAOImpl(em);

		Agencia agencia = new Agencia("Rua Paulo Licio Rizzo");

		ContaCorrente corrente = new ContaCorrente(agencia, 500.00, 10.00, 0);

		ContaPoupanca poupanca = new ContaPoupanca(agencia, 1000.00, 0.5);

		try {
			cCorrente.create(corrente);
			cPoupanca.create(poupanca);
			cPoupanca.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		} finally {
			em.close();
			System.exit(0);
		}
	}
}
