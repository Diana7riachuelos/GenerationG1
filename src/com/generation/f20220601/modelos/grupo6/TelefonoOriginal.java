package com.generation.f20220601.modelos.grupo6;

public class TelefonoOriginal {
	
	private String pantalla;
	private String color;
	private Integer anio;
	public TelefonoOriginal() {
		super();
	}
	public TelefonoOriginal(String pantalla, String color, Integer anio) {
		super();
		this.pantalla = pantalla;
		this.color = color;
		this.anio = anio;
	}
	public String getPantalla() {
		return pantalla;
	}
	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return "TelefonoOriginal [pantalla=" + pantalla + ", color=" + color + ", anio=" + anio + "]";
	}
	
	

}
