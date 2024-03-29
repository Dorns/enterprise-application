package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_TECNICO")
@SequenceGenerator(name="seqTecnico", sequenceName="SQ_TB_TECNICO", allocationSize=1)
public class Tecnico {

	@Id
	@Column(name="CD_TECNICO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqTecnico")
	private int codigo;
	
	@Column(name="NM_TECNICO", nullable=false)
	private String nome;
}
