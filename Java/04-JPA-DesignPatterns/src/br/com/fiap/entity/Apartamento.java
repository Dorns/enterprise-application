package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="RM76093")
@SequenceGenerator(name="seqAp", sequenceName="SQ_APARTAMENTO", allocationSize=1)
public class Apartamento {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqAp")
	private int codigo;
	
	
	private String endereco;

	public Apartamento(int codigo, String endereco) {
		super();
		this.codigo = codigo;
		this.endereco = endereco;
	}

	public Apartamento() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
