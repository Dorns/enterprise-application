package br.com.fiap.view;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.beans.Carro;

public class Serializacao {
	public static void main(String[] args) throws Exception {
		FileOutputStream fileStream = new FileOutputStream("teste.txt");
		
		ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
		
		Carro carro =  new Carro("ABC-1234", "Azul");
		
		objectStream.writeObject(carro);
		
		System.out.println("Carro serializado");
		fileStream.close();
		System.exit(0);
	}
}
