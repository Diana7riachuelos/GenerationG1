package com.generation.f20220525;

import java.util.Scanner;

public class RangoEdadesIngresosGrupal {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Ingrese la opcion (1) para entrar; (0) para salir");
	        int opcion = sc.nextInt();//capturando el ingreso por consola

	        /**VALIDAR EL INGRESO ERRONEO DE LA OPCION**/

	        //while valida que la condicion sea verdadera

	        while (opcion != 1 && opcion != 0) {

	            System.out.println("Incorrecto, por favor reingresar opcion valida\n");
	            System.out.println("Ingrese la opcion (1) para entrar; (0) para salir");
	            opcion = sc.nextInt();
	        }
	        System.out.println(" fuera del while\n");

	        if (opcion == 1) {
	            System.out.println("********BIENVENIDO********");
	            System.out.println("Escoja su rango de edad:\n(1) 70 años o más \n(2) 50 - 69 años \n(3) 30 - 49 años \n(4) 29 años o menos");
	            System.out.println("**************************");

	            int rango1 = 500;
	            int rango2 = 400;
	            int rango3 = 250;
	            int rango4 = 100;

	            opcion = sc.nextInt();
	            while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
	                System.out.println("Incorrecto, por favor reingresar opcion valida\n");
	                opcion = sc.nextInt();
	            }
	            switch (opcion) {
	                case 1://
	                    // accion para la opcion 1
	                    System.out.println("Le corresponde pagar: " + rango1);
	                    break;
	                case 2:
	                    System.out.println("Le corresponde pagar: " + rango2);
	                    break;
	                case 3:
	                    System.out.println("Le corresponde pagar: " + rango3);

	                    break;
	                case 4:
	                    System.out.println("Le corresponde pagar: " + rango4);

	                    break;

	                default:
	                    System.out.println("opcion invalida");
	                    break;
	            }
	        } else {
	            System.out.println("Sesion Finalizada con Exito!\n");
	            System.out.println("*******************************");

	        }
	    }

}
