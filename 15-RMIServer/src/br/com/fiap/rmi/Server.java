package br.com.fiap.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.fiap.service.impl.CotacaoServiceImpl;

public class Server {
	
	public static void main(String[] args) throws Exception {
		
		Registry registry = LocateRegistry.createRegistry(1234);
		
		registry.bind("universo", new CotacaoServiceImpl());
		
		System.out.println("Objeto Registrado!");
	}
}
