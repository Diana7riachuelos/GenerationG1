package com.generation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
//persistencia es mantener, hiberner facilita la comunicacion del usuario con la tabla
@Entity
@Table(name="usuarios")
public class Usuario {
//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Size(min=3, max= 20)
private String nombre;
	
	@Size(min=3, max= 20)
private String apellido;
	
	
private Integer edad;

@NotNull
@Size(min=6, max= 8)
private String password;

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
//constructores
public Usuario() {
	super();
}
public Usuario(String nombre, String apellido, Integer edad, String password) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.password= password;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public Integer getEdad() {
	return edad;
}
public void setEdad(Integer edad) {
	this.edad = edad;
}

}
