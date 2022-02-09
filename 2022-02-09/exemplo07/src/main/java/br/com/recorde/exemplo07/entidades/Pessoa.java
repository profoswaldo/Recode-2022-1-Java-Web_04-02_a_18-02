package br.com.recorde.exemplo07.entidades;

import java.io.Serializable;

public abstract class Pessoa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
