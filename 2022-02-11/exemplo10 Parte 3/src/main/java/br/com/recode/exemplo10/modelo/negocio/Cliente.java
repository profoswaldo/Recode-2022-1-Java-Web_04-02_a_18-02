package br.com.recode.exemplo10.modelo.negocio;

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
public class Cliente  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long codigo_cli;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String data;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	private List<Venda> vendas = new ArrayList<Venda>();
	
	
	public Cliente() {
		super();
	}


	public Cliente(Long id, Long codigo_cli, String nome, String endereco, String telefone, String email,
			String data) {
		super();
		this.id = id;
		this.codigo_cli = codigo_cli;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.data = data;
	}


	
	public List<Venda> getVendas() {
		return vendas;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCodigo_cli() {
		return codigo_cli;
	}


	public void setCodigo_cli(Long codigo_cli) {
		this.codigo_cli = codigo_cli;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo_cli);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(codigo_cli, other.codigo_cli);
	}

	
	
	

}
