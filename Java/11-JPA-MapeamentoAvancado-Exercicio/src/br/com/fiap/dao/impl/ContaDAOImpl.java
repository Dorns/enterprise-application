package br.com.fiap.dao.impl;

import br.com.fiap.entity.Conta;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaDAO;

public class ContaDAOImpl extends GenericDAOImpl<Conta, Integer> implements ContaDAO{

	public ContaDAOImpl(EntityManager em) {
		super(em);
	}
}
