package br.com.fiap.dao;

import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.exception.IdNotFoundException;

public interface GenericDAO<T,K> {

	void create(T entidade);
	void updade (T entidade);
	void delete (K id) throws IdNotFoundException;
	T find (K id);
	void commit() throws CommitErrorException;
}
