package com.web.skins.models.entity;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuarios {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	@NotEmpty(message = "El nombre del usuario no puede estar vacio.")
	@Size(min = 3, max = 25, message = "El nombre no puede tener menos de 3 caracteres ni más de 25.")
	private String nombre;
	
	@Column(name = "nick")
	@NotEmpty(message = "El nick del usuario no puede estar vacio.")
	@Size(min = 3, max = 25, message = "El nombre no puede tener menos de 3 caracteres ni más de 25.")
	private String nick;
	
	@Column(name = "email")
	@NotEmpty(message = "El email del usuario no puede estar vacio.")
	@Email
	private String email;
	
	@Column(name = "password")
	@NotEmpty(message = "El email del usuario no puede estar vacio.")
	private String password;
	
	@Column(name = "rol")
	private String rol;
	

	//Constructor
	public Usuarios(Long id, String nombre, String nick, String email, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nick = nick;
		this.email = email;
		this.password = password;
	}
	public Usuarios() {
		
	}
	//Gettes & Setters
	/********* Id *********/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/********* Nombre *********/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/********* Nick *********/
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	/********* Email *********/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/********* Password *********/
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//ToString
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", nick=" + nick + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	
	
	
	
	
}
