package br.com.fiap.bo;

import javax.ejb.Remote;

@Remote
public interface CarrinhoBO {
	
	double adicionarBitcoin(double bitcoin);
	
}
