package br.com.recode.exemplo10.modelo.negocio;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Venda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long codigo_venda;
	private String data;
	private String hora;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	
	public Venda() {
		super();
	}


	public Venda(Long id, Long codigo_venda, String data, String hora) {
		super();
		this.id = id;
		this.codigo_venda = codigo_venda;
		this.data = data;
		this.hora = hora;
	}


	
	


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCodigo_venda() {
		return codigo_venda;
	}


	public void setCodigo_venda(Long codigo_venda) {
		this.codigo_venda = codigo_venda;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo_venda);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		return Objects.equals(codigo_venda, other.codigo_venda);
	}
	
	
	
	
	

}
