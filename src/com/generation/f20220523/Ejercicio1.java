package com.generation.f20220523;

public class Ejercicio1 {
	public static void main(String[] args) {
		// calculo area y calculo del perimetro
		
		//variables estaticas
		//formula area triangulo
		//impresion
		
		//formula perimetro circulo
		//impresion
		
		System.out.println("**********");
		System.out.println("*Calculos*");
		System.out.println("**********");
		//Calculo area y calculo del perimetro
		//variables estaticas
		float b = (float)5.2;
		float h = (float)6.4;
		float pi = (float)3.1416;
		float r = (float)2.2;
		
		int dosConstTR = 2;
		double dosPI = 2 * pi;
		//formula area triangulo
		float dosContTR = 0;
		float areaCir = (float)(b * h/ dosContTR);
		//Impresion
		System.out.println("El area de un triangulo de base" + b + "y altura" + h + "es:"+areaCir);
		//formula perimetro circulo
		float perimetroTri = (float)(dosPI*r);
		//impresion
		System.out.println("El perimetro de un circulo de radio" + r + "es:" + perimetroTri);
		
	}


}
