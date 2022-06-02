package com.generation.f20220601.modelos.grupo6;

public class TelefonoIpad extends TelefonoIphone{
	
	private boolean portatil;
	private String tamanio;
	private Integer anio;
	public TelefonoIpad() {
		super();
	}
	public TelefonoIpad(boolean portatil, String tamanio, Integer anio) {
		super();
		this.portatil = portatil;
		this.tamanio = tamanio;
		this.anio = anio;
	}
	public boolean isPortatil() {
		return portatil;
	}
	public void setPortatil(boolean portatil) {
		this.portatil = portatil;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return "TelefonoIpad [portatil=" + portatil + ", tamanio=" + tamanio + ", anio=" + anio + "]";
	}
	
	

}
