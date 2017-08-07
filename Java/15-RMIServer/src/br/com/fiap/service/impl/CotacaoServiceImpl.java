package br.com.fiap.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import br.com.fiap.service.CotacaoService;

public class CotacaoServiceImpl 
						extends UnicastRemoteObject
								implements CotacaoService {

	public CotacaoServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public double converterLibraReal(double libra) throws RemoteException {
		return libra*4.12;
	}
}
