package com.generation.f20220526;

public class FuncionCalculadora {

	public static void main(String[] args) {
		//Math
		
		//elevar o potencia
		double numeroElevado = Math.pow(3, 4);
		System.out.println(numeroElevado);
		
		//Redondear al entero mayor
		double enteroMayor = Math.ceil(numeroElevado);
		System.out.println(enteroMayor);
		
		//Redondear al entero menor
		double enteroMenor = Math.floor(numeroElevado);
		System.out.println(enteroMenor);
		
		//Redondeo
		double enteroRedondeado = Math.round(numeroElevado);
		System.out.println(enteroRedondeado);
		
		double num1= 12;
		double num2= 5;
		double div= num1/num2;
		System.out.println(div);
		
		//numeros aleatorios
		//Math.random() >= 0.0 y 1.0
		double aleatorio = Math.random();
		System.out.println(aleatorio);
		
		//numeros aleatorios entre 0 y 10
		
		double num010 = Math.random() * 10;
		System.out.println(num010);
		
		//numeros aleatorios entre 2 y 8
		double num28 = 2 + (Math.random() * (8-2))+2;
		System.out.println(num28);
		
		//numero aleatorio entre -4 y 4
		double numNegPos= (Math.random()* (4 - -4))+ -4;
		System.out.println(numNegPos);
		
		
		
	}
}
