package com.generation.f20220601.modelos.grupo6;

public class TelefonoIphone extends TelefonoOriginal {
	
	private boolean tactil;
	private Integer peso;
	private String camara;
	public TelefonoIphone() {
		super();
	}
	public TelefonoIphone(boolean tactil, Integer peso, String camara) {
		super();
		this.tactil = tactil;
		this.peso = peso;
		this.camara = camara;
	}
	public boolean isTactil() {
		return tactil;
	}
	public void setTactil(boolean tactil) {
		this.tactil = tactil;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public String getCamara() {
		return camara;
	}
	public void setCamara(String camara) {
		this.camara = camara;
	}
	@Override
	public String toString() {
		return "TelefonoIphone [tactil=" + tactil + ", peso=" + peso + ", camara=" + camara + "]";
	}
	
	

}
