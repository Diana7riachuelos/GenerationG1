package com.generation.f20220601.modelos;

public class Mishi extends Gato{//heredamos de gato, no de mascota
//las clase objeto no van con el void main
	private Boolean famosoEnInternet;

	public Mishi(Boolean garrasRetractil, Boolean visionNocturna, String ronroneo, Boolean famosoEnInternet) {
	super(garrasRetractil, visionNocturna, ronroneo);
	this.famosoEnInternet = famosoEnInternet;
}

	public Mishi() {
		super();
	}

	public Boolean getFamosoEnInternet() {
		return famosoEnInternet;
	}

	public void setFamosoEnInternet(Boolean famosoEnInternet) {
		this.famosoEnInternet = famosoEnInternet;
	}

	@Override
	public String toString() {
		return "Mishi [famosoEnInternet=" + famosoEnInternet + "]";
	}

	public Mishi(Boolean famosoEnInternet) {//constructor es el que no esta seleccionado, el super. uno es el padre, otro es el abuelo
		super();
		this.famosoEnInternet = famosoEnInternet;
	}
	
}
