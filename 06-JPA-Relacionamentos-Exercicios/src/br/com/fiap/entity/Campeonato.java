package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_Campeonato")
@SequenceGenerator(name="seqCampeonato", sequenceName="SQ_TB_CAMPEONATO", allocationSize=1)
public class Campeonato {

	@Id
	@Column(name="CD_CAMPEONATO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqCampeonato")
	private int codigo;
	
	@Column(name="NM_CAMPEONATO", nullable=false)
	private String nome;
}
