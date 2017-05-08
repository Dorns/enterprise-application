package br.com.fiap.socket;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.beans.Carro;

public class Server {
	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(123);
		
		System.out.println("Aguardando conexão...");
		
		Socket socket = server.accept();
		
		ObjectInputStream objectStream =  new ObjectInputStream(socket.getInputStream());
		
		Carro carro = (Carro) objectStream.readObject();
		
		System.out.println(carro.getPlaca() + " " + carro.getCor());
		
		server.close();
		objectStream.close();
		System.exit(0);
	}
}
