package br.com.recode.exemplo09.entidades;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Turma implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long codigo;
	private String curso;
	
	@JsonIgnore
	@OneToMany(mappedBy = "turma")
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
