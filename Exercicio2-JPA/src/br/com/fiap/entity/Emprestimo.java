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
@Table(name="TB_EMPRESTIMO")
@SequenceGenerator(name="seqEmprestimo", allocationSize=1, sequenceName="SQ_TB_EMPRESTIMO")
public class Emprestimo {
	
	@Id
	@Column(name="CD_EMPRESTIMO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqEmprestimo")
	private int id;
	
	@Column(name="DT_EMPRESTIMO", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dt_emprestimo;
	
	@Column(name="DT_RETORN", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dt_retorno;

	public Emprestimo(int id, Calendar dt_emprestimo, Calendar dt_retorno) {
		super();
		this.id = id;
		this.dt_emprestimo = dt_emprestimo;
		this.dt_retorno = dt_retorno;
	}

	public Emprestimo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDt_emprestimo() {
		return dt_emprestimo;
	}

	public void setDt_emprestimo(Calendar dt_emprestimo) {
		this.dt_emprestimo = dt_emprestimo;
	}

	public Calendar getDt_retorno() {
		return dt_retorno;
	}

	public void setDt_retorno(Calendar dt_retorno) {
		this.dt_retorno = dt_retorno;
	}

}
