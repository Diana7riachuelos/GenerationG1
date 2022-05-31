package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EjercicioPlatillos {
	 public static void main(String[] args) {

	        HashMap objHashMap = new HashMap<>();
	        Scanner scanner = new Scanner(System.in);

	        ArrayList<String> platillos = new ArrayList<>();
	        platillos.add("pure");
	        platillos.add("papa");
	        platillos.add("arroz");
	        platillos.add("cazuela");
	        platillos.add("vegano");

	        objHashMap.put("platillos", platillos);


	        /*for (int i = 0; i < platillos.size(); i++) {
	            System.out.println(platillos.get(i));

	        }
	        for (Object clave : objHashMap.keySet()) {
	            System.out.println("clave : " + clave + " - valor: " + objHashMap.get(clave));

	        }

	        System.out.println(objHashMap);*/

	        System.out.println("*******************MENU DE HOY********************");
	        System.out.println(objHashMap.get("platillos"));
	        System.out.println("Ingrese opción: ");
	        System.out.println("1 PURE\n2 ARROZ\n3 PAPA\n4 CAZUELA\n5 VEGANO");
	        int opcion = scanner.nextInt();
	        switch (opcion) {//Aqui estan las opciones mediante un switch
	            case 1://pure

	                System.out.println("Usted eligio para comer: " + platillos.get(0));//En caso que el usuario digite 1 imprimira lo que esta en la posicion 0
	                break;
	            case 2: //arroz
	                System.out.println("Usted eligio para comer: " + platillos.get(1));//En caso que el usuario digite 2 imprimira lo que esta en la posicion 1

	                break;
	            case 3://papa
	                System.out.println("Usted eligio para comer: " + platillos.get(2));
	                ;

	                break;
	            case 4://cazuela
	                System.out.println("Usted eligio para comer: " + platillos.get(3));
	                ;

	                break;
	            case 5://vegano

	                System.out.println("Usted eligio para comer: " + platillos.get(4));

	                break;
	            default:
	                System.out.println("opcion invalida");
	                break;
	        }
	    }

}
