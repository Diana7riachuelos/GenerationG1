package com.generation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="autos")
public class Auto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String marca;
	private String modelo;
	private float velocidad;
	private String color;
	public Auto() {
		super();
	}
	public Auto(String marca, String modelo, float velocidad, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
