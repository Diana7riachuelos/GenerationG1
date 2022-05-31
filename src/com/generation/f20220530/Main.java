package com.generation.f20220530;

import java.util.ArrayList; //las interfases solo definen los metodos, las estructuras. Arraylist amplia las opciones de un arreglo.

import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Alumno> ListaAlumnos = new ArrayList<Alumno>(); //importar list de java util. List es una interfaz, y el array es una clase. List amplia las posibilidades. list entrega numero de elementos en la lista. Array list agrega posibilidades segun la lista.
		
		//instancia de una clase, es una definicion de un objeto, solo hay que llamar, para que llegue y este presente; el objeto esta escrito con mayuscula
		Alumno alumno = new Alumno(); //()llama al constructor vacio, este asigna valores a nuestros atributos
		Alumno alumno2 = new Alumno("Diana","Miranda",27,"G1");
		
		ListaAlumnos.add(alumno);
		ListaAlumnos.add(alumno2);
		
		
		//Ahora recorreremos la lista alumnos con for
		
		for (int i = 0; i < ListaAlumnos.size(); i++) {
			System.out.println(ListaAlumnos.get(i).getNombre()); //(i)entrega valor de la variable. get nombre es un objeto en esa posicion
			System.out.println(ListaAlumnos.get(i).getApellido());
			
		}
		
		for (Alumno objetoAlumno : ListaAlumnos) {
			/*System.out.println(objetoAlumno.getNombre());
			System.out.println(objetoAlumno.getCurso());*/
			System.out.println(objetoAlumno.toString());
			
		}
		
		//si aqui se pone el alumno.setNombre("Jesus"); debiese aparecer sin el null
		
		System.out.println(alumno.getNombre());//Get es para obtener el valor asignado a la variable
		System.out.println(alumno2.getNombre());
		
		//setter, no usa Syso para imprimir.Asigna a la variable alumno un nombre, es otra forma.
		alumno.setNombre("Jesus");
		System.out.println(alumno.getNombre());
		//get es obtener, set asignar.
		
		//2 nombre iguales, se sobre escribe el valor. Se imprime como historial
		System.out.println(alumno2.toString()); //
		
		
	}
	

}
