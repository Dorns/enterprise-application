package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaCorrenteDAO;
import br.com.fiap.entity.ContaCorrente;

public class ContaCorrenteDAOImpl extends GenericDAOImpl<ContaCorrente, Integer> implements ContaCorrenteDAO{

	public ContaCorrenteDAOImpl(EntityManager em) {
		super(em);
	}
}
