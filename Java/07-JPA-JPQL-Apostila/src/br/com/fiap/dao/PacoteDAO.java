package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public interface PacoteDAO extends GenericDAO<Pacote,Integer>{

	List<Pacote> listar();
	
	List<Pacote> buscarPorPreco(float minimo, float maximo);
	
	List<Pacote> buscarPorTransporte(Transporte transporte);
	
	List<Pacote> buscaPorData(Calendar inicio, Calendar fim);
	
	// Retornar o preco medio dos pacotes cadastrados
	double buscarPrecoMedioPacote();

	// Retornar a quantidade de pacote cadastrados que possuem a data de saída entre as duas datas
	long buscarPacotePorData(Calendar inicio, Calendar fim);
	
	// Retornar o pacote que possui maior preço
	List<Pacote> buscarPacoteMaiorPreco();
}