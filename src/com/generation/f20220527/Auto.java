package com.generation.f20220527;

public class Auto {
	//Una clase es un modelo o prototipo para crear objetos, o a partir de el crear objetos.
	//Un objeto nace a partir de la clase, caracteristica o atributo
	//tiene metodos o funciones
    //algo concreto lo convertimos en abstracto(no tangible).
	//tangible: usamos los 5 sentidos o alguno de ellos para describirlo
	
	
	//atributo
	//accesador tipo nombreDelAtributo
	private String color;
	private String marca;
	private String modelo;
	private Double velocidad;
	public Auto(String color, String marca, String modelo, Double velocidad) {
		//constructores (no se crea clase main)
		
		
		//constructor con parametros
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	//accesadores y mutadores (get y set)
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
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
	public Double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	//constructor vacio
	public Auto() {
		
	}
	
		//constructores (dan valores al atributo)
	    
		
		//metodos o funciones personalizadas
	
	public void aumentarVelocidad() {
		this.velocidad = 10d;
			
	}
	
	

	/*atributo
	color;
	ruedas;
	modelo;
	luces;
	marca;
	kilometraje;
	nitro;
	manubrio;
	combustible;
	precio;
	*/
	
	/*funciones
	traslado
	trabajo
	cargar
	frenar
	ventilar
	reproducir musica
	retroceder
	apaga o enciende
	*/
	//atributo de colaboracion u objeto de colaboracion, es tomar un objeto y usarlo como atributo
	//valores agregados al proposito principal del objeto
	//la clase esta en la parte superior, hereda atributos
    //aterrizar requerimiento
	//pilares, 1 herencia (nacemmos objeto), ser vivo, se desprenden muchas ramas.
	
	
}

