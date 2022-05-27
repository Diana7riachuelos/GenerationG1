package com.generation.f20220525;
import java.util.Scanner;
public class BucleDoWhile {
	public static void main(String[] args) {
		// DoWhile
		// a lo menos se ejecutara una vez
		int termino = 20;
		do {

			System.out.println("DoWhile el valor de termino es " + termino);

		} while (termino <= 10);
		while (termino <= 10) {
			System.out.println("While el valor de termino es " + termino);
			termino++;
		}
		System.out.print(false);
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
			opcion = sc.nextInt();
		
		}while(opcion < 0 || opcion > 4);//(5)F o V = V

	}

}
