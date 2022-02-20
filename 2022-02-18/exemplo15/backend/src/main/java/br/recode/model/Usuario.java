package br.recode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;

	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_id")
	private String idEmail;
	
	public Usuario() {
		
	}
	
	public Usuario(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.idEmail = emailId;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}
	

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdEmail() {
		return idEmail;
	}

	public void setIdEmail(String idEmail) {
		this.idEmail = idEmail;
	}
	
	
	
}
