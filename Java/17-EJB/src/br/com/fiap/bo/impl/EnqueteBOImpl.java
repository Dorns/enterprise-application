package br.com.fiap.bo.impl;

import javax.ejb.Singleton;

import br.com.fiap.bo.EnqueteBO;

@Singleton
public class EnqueteBOImpl implements EnqueteBO{

	private int sim, nao;
	
	@Override
	public int votarSim() {
		return ++sim;
	}

	@Override
	public int votarNao() {
		return ++nao;
	}

}
