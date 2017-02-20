package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_LIVRO")
@SequenceGenerator(name="seqLivro", sequenceName="SEQ_TB_LIVRO", allocationSize=1)
public class Livro {

	@Id
	@Column(name="CD_LIVRO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqLivro")
	private int isbn;

	@Column(name="DS_TITULO", nullable=false, length=200)
	private String titulo;

	@Column(name="NR_PRECO")
	private float preco;

	@Column(name="DT_LANCAMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar dt_lancamento;

	@Column(name="FL_CAPA")
	private byte[] capa;

	public Livro(int isbn, String titulo, float preco, Calendar dt_lancamento, byte[] capa) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.preco = preco;
		this.dt_lancamento = dt_lancamento;
		this.capa = capa;
	}

	public Livro() {
		super();
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Calendar getDt_lancamento() {
		return dt_lancamento;
	}

	public void setDt_lancamento(Calendar dt_lancamento) {
		this.dt_lancamento = dt_lancamento;
	}

	public byte[] getCapa() {
		return capa;
	}

	public void setCapa(byte[] capa) {
		this.capa = capa;
	}

}
