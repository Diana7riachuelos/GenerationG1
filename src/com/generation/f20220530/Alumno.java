package com.generation.f20220530;

public class Alumno {
	//atributos, variables por separado.
	private String nombre;//nombre singular //porque accedemos dentro de la misma clase//protected (nosolo dentro de la misma clase, sino todos los que esten dentro del package, se pueden compartir informacion) o public(todos pueden acceder, de cualquier parte)	//encapsulacion, es proteger lainformacion, no cualquiera puede tener acceso
	private String apellido;
	private int edad;
	private String curso; //la letra se mantiene, se incrementa la letra, y en la concatenacion se pone numeral y la letra. //mas adelante cambiar variables a tipo objeto.
	//constructores(se crea con sourse, boton derecho, sourse, generate constructor using fields)
	public Alumno() {
		super();
	}
	public Alumno(String nombre, String apellido, int edad, String curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
	}
	
	//get y set(sourse, getter y setters
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + "]";
	}
	//boton derecho, generar de sourse, to string.
	
	
	//funciones

}
