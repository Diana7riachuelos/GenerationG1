package com.generation.f20220525;

public class Main {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 4;
		int num3 = 6;
		int num4 = 8;
		int num5 = 10;
		int num6 = 12;
		int num7 = 14;
		int num8 = 16;
		int num9 = 18;
		int num10 = 20;
		
		int oddAddition = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		System.out.println("La suma de los primeros 10 numeros impares es:" + oddAddition);
		

	}
	public static boolean is0dd (int numero) {
		
	return numero % 2 == 0;
		
	}

}
