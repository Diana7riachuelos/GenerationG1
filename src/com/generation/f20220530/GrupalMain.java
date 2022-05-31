package com.generation.f20220530;

public class GrupalMain {
	 public static void main(String[] args) {
	        //instancia de una clase

	        Alumno alumno = new Alumno();
	        Alumno alumno2 = new Alumno();
	        Alumno alumno3 = new Alumno();
	        Alumno alumno4 = new Alumno();
	        Alumno alumno5 = new Alumno();


	        alumno.setNombre("Alondra");
	        alumno2.setNombre("Diana");
	        alumno3.setNombre("Matias");
	        alumno4.setNombre("Michael");
	        alumno5.setNombre("Paulino");

	        alumno.setApellido("Valenzuela");
	        alumno2.setApellido("Miranda");
	        alumno3.setApellido("Rebolledo");
	        alumno4.setApellido("Roldan");
	        alumno5.setApellido("Rubio");

	        alumno.setEdad(24);
	        alumno2.setEdad(27);
	        alumno3.setEdad(28);
	        alumno4.setEdad(28);
	        alumno5.setEdad(28);

	        alumno.setCurso("G1");
	        alumno2.setCurso("G1");
	        alumno3.setCurso("G1");
	        alumno4.setCurso("G1");
	        alumno5.setCurso("G1");

	        //SYSOS GET

	        System.out.println("****INTEGRANTES GRUPO 6****");


	        System.out.println("Nombre: "+ alumno.getNombre() + " Apellido: "+alumno.getApellido()+ " Edad: "+alumno.getEdad()+ " Curso: "+alumno.getCurso());
	        System.out.println("Nombre: "+ alumno2.getNombre() + " Apellido: "+alumno2.getApellido()+ " Edad: "+alumno2.getEdad()+ " Curso: "+alumno2.getCurso());
	        System.out.println("Nombre: "+ alumno3.getNombre() + " Apellido: "+alumno3.getApellido()+ " Edad: "+alumno3.getEdad()+ " Curso: "+alumno3.getCurso());
	        System.out.println("Nombre: "+ alumno4.getNombre() + " Apellido: "+alumno4.getApellido()+ " Edad: "+alumno4.getEdad()+ " Curso: "+alumno4.getCurso());
	        System.out.println("Nombre: "+ alumno5.getNombre() + " Apellido: "+alumno5.getApellido()+ " Edad: "+alumno5.getEdad()+ " Curso: "+alumno5.getCurso());
	    }

}
