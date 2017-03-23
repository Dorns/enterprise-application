package fiap.com.br.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ALUNO")
@SequenceGenerator(name = "seqAluno", sequenceName = "SQ_TB_ALUNO", allocationSize = 1)
public class Aluno {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqAluno")
	private int rm;

	@Column(name="NM_ALUNO", nullable=false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="CD_GRUPO")
	//Na prova vai ser bi direcional
	private GrupoAm grupo;
	
	@ManyToMany(mappedBy="alunos", cascade=CascadeType.PERSIST)//Nome do list do relacionamento
	private List<Disciplina> disciplinas;

	public GrupoAm getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoAm grupo) {
		this.grupo = grupo;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Aluno(int rm, String nome) {
		super();
		this.rm = rm;
		this.nome = nome;
	}

	public Aluno() {
		super();
	}

	public Aluno(int rm, String nome, GrupoAm grupo) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.grupo = grupo;
	}

	public Aluno(String nome) {
		super();
		this.nome = nome;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
