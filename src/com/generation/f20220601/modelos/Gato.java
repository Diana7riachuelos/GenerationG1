package com.generation.f20220601.modelos;

public class Gato extends Mascota{
	
   public Boolean getGarrasRetractil() {
		return garrasRetractil;
	}
	public void setGarrasRetractil(Boolean garrasRetractil) {
		this.garrasRetractil = garrasRetractil;
	}
	public Boolean getVisionNocturna() {
		return visionNocturna;
	}
	public void setVisionNocturna(Boolean visionNocturna) {
		this.visionNocturna = visionNocturna;
	}
	public String getRonroneo() {
		return ronroneo;
	}
	public void setRonroneo(String ronroneo) {
		this.ronroneo = ronroneo;
	}
public Gato(Boolean garrasRetractil, Boolean visionNocturna, String ronroneo) {
		super();
		this.garrasRetractil = garrasRetractil;
		this.visionNocturna = visionNocturna;
		this.ronroneo = ronroneo;
	}
public Gato() {
		super();
	}
	//extends sig. que usamos herencia
	private Boolean garrasRetractil;
	private Boolean visionNocturna;
	private String ronroneo;
	@Override
	public String toString() {
		return "Gato [garrasRetractil=" + garrasRetractil + ", visionNocturna=" + visionNocturna + ", ronroneo="
				+ ronroneo + super.toString()+"]";//concatenamos al final-sobreescribimos, mantenemos estructura base en toString, pero lo podemos modificar
	}
	
	 public void hacerSonido() {
		   System.out.println("Miau");
	
		
	}
}
	
	


