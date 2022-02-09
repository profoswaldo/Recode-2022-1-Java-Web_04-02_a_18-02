package br.com.recorde.exemplo06.entidades;

public abstract class Pessoa {
	
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
