package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ProjetoAmDAO;
import fiap.com.br.entity.ProjetoAm;

public class ProjetoAmDAOImpl extends GenericDAOImpl<ProjetoAm, Integer> implements ProjetoAmDAO{

	public ProjetoAmDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	
	
}
