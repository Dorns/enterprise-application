package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Autor;
import br.com.fiap.entity.Editora;
import br.com.fiap.entity.Livro;
import br.com.fiap.entity.Sexo;

public class CadastroTeste {

	public static void main(String[] args) {
		// Obter uma instancia da Fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		// Obter uma instancia do EntityManager
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar uma editora, livro e um autor
		Editora editora = new Editora(0, "44.597.052/0001-62", "Fantasy - Casa da Palavra", "Rua Editora Abril");
		Livro livro = new Livro (0, "O Espadachim de Carvão", 25.00f, new GregorianCalendar(2013, Calendar.JANUARY,1), null);
		Autor autor = new Autor (0, "Afonso", Sexo.MASCULINO, "Solano", new GregorianCalendar(1981, Calendar.NOVEMBER, 13));
		
		//Cadastrar uma editora, livro e autor
		em.persist(editora);
		em.persist(livro);
		em.persist(autor);
		
		//Transação
		//Incializa uma transação
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fecha a transação
		em.close();
		
		System.out.println("Dados cadastrados com sucesso!");
		System.exit(0);
	}
}
