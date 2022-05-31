package com.generation.f20220531;

import java.util.List;

public class Cliente { //si pones los atributos privados no se verán en la otra clase del package, se pueden ver solo dentro de la clase
	private String rut;
	private Integer id;//ver dibujo
	private List<Integer> numerosVenta;
	private String nombre;//acc por get y set
	private String correo;
	
	
public Cliente() {//borrar este?
		super();
	}

public Cliente(String rut, Integer id, List<Integer> numerosVenta, String nombre, String correo) {
		super();
		this.rut = rut;
		this.id = id;
		this.numerosVenta = numerosVenta;
		this.nombre = nombre;
		this.correo = correo;
	}

public void modificarAtributo() {
	this.rut="123456789-0";
	nombre="Donato";
	
}

public String getRut() {
	return rut;
}

public void setRut(String rut) {
	this.rut = rut;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public List<Integer> getNumerosVenta() {
	return numerosVenta;
}

public void setNumerosVenta(List<Integer> numerosVenta) {
	this.numerosVenta = numerosVenta;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}


}
