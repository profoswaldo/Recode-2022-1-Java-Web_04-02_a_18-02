package br.com.recorde.exemplo05.entidades;



import java.io.Serializable;
import java.util.Objects;

public class Aluno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String matricula;
	private String nome;
	private double teste, prova;
	
	private Turma turma;


	
	
	public Aluno() {
		super();
	}

	

	public Aluno(Long id, String matricula, String nome) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
	}


	public Aluno(Long id, String matricula, String nome, double teste, double prova) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
		this.teste = teste;
		this.prova = prova;
	}


	public Aluno(Long id, String matricula, String nome, double teste, double prova, Turma turma) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
		this.teste = teste;
		this.prova = prova;
		this.turma = turma;
	}


	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getTeste() {
		return teste;
	}


	public void setTeste(double teste) {
		this.teste = teste;
	}


	public double getProva() {
		return prova;
	}


	public void setProva(double prova) {
		this.prova = prova;
	}


	public Turma getTurma() {
		return turma;
	}


	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	
	

}
