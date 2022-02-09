package br.com.recorde.exemplo07.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Professor extends Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String matricula;
	
	@JsonIgnore
	private List<Turma> turmas = new ArrayList<Turma>();
	
	public Professor() {
		super();
	}

	public Professor(String matricula,String nome) {
		super(nome);
		this.matricula = matricula;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public List<Turma> getTurmas() {
		return turmas;
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
		Professor other = (Professor) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	
	
	
	
}
