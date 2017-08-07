package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_JOGADOR")
@SequenceGenerator(name="seqJogador", sequenceName="SQ_TB_JOGADOR", allocationSize=1)
public class Jogador {

	@Id
	@Column(name="CD_CODIGO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqJogador")
	private int codigo;
	
	@Column(name="NM_JOGADOR", nullable=false)
	private String nome;
	
	@ManyToOne
	private Time time;
}
