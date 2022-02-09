package br.com.recorde.exemplo07.entidades;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;



public class Turma  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private Long codigo;
	private String curso;
	
	
	private Professor professor;
	
	@JsonIgnore
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	
	public Turma() {
		super();
	}

	public Turma(Long id, Long codigo, String curso) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.curso = curso;
	}
	

	public Turma(Long id, Long codigo, String curso, List<Aluno> alunos) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.curso = curso;
		this.alunos = alunos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
