package br.com.fiap.view;

import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.singleton.EntityManagerFactorySingleton;
import fiap.com.br.entity.GrupoAm;

public class BuscarGrupoTeste {

	public static void main(String[] args) {
		// Buscar o grupo e exibir o nome do grupo e projeto
		// Obter entity manager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		// Instanciar DAO
		GrupoAmDAO grupoDao = new GrupoAmDAOImpl(em);

		// Buscar Grupo
		GrupoAm grupoAm = grupoDao.find(1);

		em.close();

		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

		// Exibe
		System.out.println("Grupo \nCodigo " + grupoAm.getCodigo() + " Nome: " + grupoAm.getNome()
				+ "\nProjeto \nCódigo " + grupoAm.getProjeto().getCodigo() + " Nota: " + grupoAm.getProjeto().getNota()
				+ " Tema " + grupoAm.getProjeto().getTema() + " Data: "
				+ data.format(grupoAm.getProjeto().getDataEntrega().getTime()));

		System.exit(0);
	}
}
