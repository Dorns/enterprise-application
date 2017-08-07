package br.com.fiap.socket;

import java.io.ObjectOutputStream;
import java.net.Socket;

import br.com.fiap.beans.Carro;

public class Client {

	public static void main(String[] args) throws Exception {
		
		Socket socket= new Socket("10.10.63.13", 123);
		
		ObjectOutputStream objectStream = new ObjectOutputStream(socket.getOutputStream());

		Carro carro =  new Carro("DFG-4567", "Preto");

		objectStream.writeObject(carro);
		System.out.println("Carro Serializado!");
		objectStream.close();
		socket.close();
		System.exit(0);
	}
}
