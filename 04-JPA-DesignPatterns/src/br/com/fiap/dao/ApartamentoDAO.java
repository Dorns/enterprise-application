package br.com.fiap.dao;

import br.com.fiap.entity.Apartamento;

public interface ApartamentoDAO {

	void create(Apartamento ap);

	Apartamento find(int id);

	void update(Apartamento ap);

	void delete(int id);
}
