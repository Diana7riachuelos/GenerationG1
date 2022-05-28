package com.generation.f20220526;

import java.util.Scanner;

public class CalculadoraGrupalP {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************CALCULADORA********************");
        System.out.println("Ingrese opción: ");
        System.out.println("1 sumar\n2 restar\n3 multiplicar\n4 dividir\n5 resto");
        int opcion = scanner.nextInt();//Aqui estoy esperando la opcion que digite la persona

        while (opcion > 5 || opcion < 1) {//Aqui con el while estoy validando que solo ingrese los valores pedidos
            System.out.println("Incorrecto, debes elegir una opcion correcta");
            opcion = scanner.nextInt();//Aqui estoy esperando que coloque el valor correcto, si vuelve a colocar un valor fuera del rango se va a volver a repetir el while diciendo "Incorrecto, debes elegir una opcion correcta".
        }

        switch (opcion) {//Aqui estan las opciones mediante un switch
            case 1:// sumar
                suma();//En caso que el usuario digite 1 como opcion llamara a la funcion suma()
                break;
            case 2: //restar
                resta();//En caso que el usuario digite 2 como opcion llamara a la funcion resta()
                break;
            case 3:// multiplicacion
                multiplicacion();//En caso que el usuario digite 3 como opcion llamara a la funcion multiplicacion()
                break;
            case 4:// division
                division();//En caso que el usuario digite 4 como opcion llamara a la funcion division()
                break;
            case 5:// resto
                resto();//En caso que el usuario digite 5 como opcion llamara a la funcion resto()
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }

    }
    private static void suma() {//funcion suma() que no retorna nada, solo ejecuta el codigo cuando fue llamado en el switch al digitar la (opcion 1)
        System.out.println("¿Cuántos números deseas sumar?:");
        Scanner scanner = new Scanner(System.in);//scanner
        int contador = scanner.nextInt();//contador que me va a servir para darle el valor de termino de mi for
        int numeros[] = new int[contador];

        int resultadoSuma = 0;
        for (int i = 0; i < contador; i++) {//aqui esta el for, se va a terminar el "for"hasta el numero que digito el usuario

            System.out.println("Ingrese número " + (i + 1) + ": ");//aqui va aparecer "ingrese numero 1 : "en pantalla
            int numero = scanner.nextInt();//Aqui estoy esperando a que digite un numero
            numeros[i] = numero;//lo guardo en un arreglo cada numero que digite
            resultadoSuma = (resultadoSuma + numeros[i]);//Aqui hay un acumulador que va sumando los numeros del arreglo
        }
        System.out.println("El resultado de la suma es: " + resultadoSuma);//Finalmente imprimo el resultado de la suma
    }

    private static void resta() {//funcion resta() que no retorna nada, solo ejecuta el codigo cuando fue llamado en el switch al digitar la (opcion 2)
        System.out.println("¿Cuántos números deseas restar?:");
        Scanner scanner = new Scanner(System.in);
        int contador = scanner.nextInt();
        int numeros[] = new int[contador];

        int resultadoResta = 0;
        for (int i = 0; i < contador; i++) {

            System.out.println("Ingrese número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
            if (i == 0) {//Aqui se iguala a cero para que entre solo una vez y guarde el primer numero en la variable resultadoResta
                resultadoResta = numero;
            } else {
                resultadoResta = resultadoResta - numero;
            }
        }
        System.out.println("El resultado de la resta es: " + resultadoResta);

    }

    private static void multiplicacion() {//funcion multiplicacion() que no retorna nada, solo ejecuta el codigo cuando fue llamado en el switch al digitar la (opcion 3)
        System.out.println("¿Cuántos números deseas multiplicar?:");
        Scanner scanner = new Scanner(System.in);
        int contador = scanner.nextInt();
        int numeros[] = new int[contador];

        int resultadoMultiplicacion = 1;//se inicia la variable con valor 1 para que no repercuta en mi variable acumuladora
        for (int i = 0; i < contador; i++) {

            System.out.println("Ingrese número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros[i] = numero;
            resultadoMultiplicacion = resultadoMultiplicacion * (numeros[i]);//variable acumuladora multiplicacion

        }
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);
        ;

    }

    private static void division() {//funcion division() que no retorna nada, solo ejecuta el codigo cuando fue llamado en el switch al digitar la (opcion 4)
        System.out.println("¿Cuántos números deseas dividir?:");
        Scanner scanner = new Scanner(System.in);
        int contador = scanner.nextInt();
        float numeros[] = new float[contador];

        float resultadoDivision = 1;
        for (int i = 0; i < contador; i++) {
            System.out.println("Ingrese número " + (i + 1) + ": ");
            float numero = scanner.nextInt();
            while (numero == 0) {
                System.out.println("ingrese un numero distinto de cero, por favor ");
                numero = scanner.nextInt();
            }
            numeros[i] = numero;
            if (i == 0) {
                resultadoDivision = numero;
            } else {
                resultadoDivision = resultadoDivision / numero;//variable acumuladora division
            }
        }
        System.out.println("El resultado de la division es: " + resultadoDivision);
    }

    private static void resto() {//funcion resto() que no retorna nada, solo ejecuta el codigo cuando fue llamado en el switch al digitar la (opcion 5)
        System.out.println("Ingrese un numero:");//Le pide al usuario por consola que ingrese un numero
        Scanner scanner = new Scanner(System.in);//Scanner

        int numero = scanner.nextInt();//Esperando a que digite un numero

        int resultadoResto = (numero % 2);// si el numero es par el resto es 0, si es impar es 1

        System.out.println("El resultado del resto es: " + resultadoResto);

    }


}
