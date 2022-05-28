package com.generation.f20220525;

import java.util.Scanner;

public class Ejercicio2Grupal {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ticket normal = 3500
        //< = a 15años = 60%
        //mayores de 60 años = 55%

        System.out.println("Ingrese su edad: ");

        //variables
        int edad= sc.nextInt();
        int valorTicket = 3500;
        int cantidadBoletos = 0;
        int montoTotal = 0;
        float descuento1 = 0.6f;
        float descuento2 = 0.55f;
        float descuento3 = 0.3f;


        if (edad > 60){
            montoTotal = (int) (valorTicket * descuento2);
            montoTotal = valorTicket - montoTotal;
            System.out.println("Felicidades tienes un 55% de descuento el precio final es de: "+montoTotal);

        } else if (edad <= 15) {
            montoTotal = (int) (valorTicket * descuento1);
            montoTotal = valorTicket - montoTotal;
            System.out.println("Felicidades tienes un 60% de descuento el precio final es de: "+montoTotal);

        } else {

            System.out.println("Cuantos boletos deseas comprar?: ");
            cantidadBoletos= sc.nextInt();

                if (cantidadBoletos  >= 2){
                    valorTicket = (valorTicket * cantidadBoletos);
                    montoTotal = (int) (valorTicket * descuento3);
                    montoTotal = valorTicket - montoTotal;
                    System.out.println("Felicidades tienes un 30% de descuento el precio final es de: "+montoTotal);

                }
            }

        }


}
