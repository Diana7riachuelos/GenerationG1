package com.generation.f20220602;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 //Listas
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        List<Profesor> listaProfesores = new ArrayList<Profesor>();
        List<Alumno> listaAlumnos = new ArrayList<Alumno>();

        //Instancias
       /* Usuario usuario = new Usuario();
        Profesor profesor = new Profesor();
        Alumno alumno = new Alumno();*/

        //set
        Usuario diana321 = new Usuario();
        diana321.setNombre("Diana321");
        diana321.setPassword("hola1234");
        diana321.setSexo("Femenino");
        diana321.setEmail("dianamp@gmail.com");
        listaUsuarios.add(diana321);

        Usuario michael321 = new Usuario();
        michael321.setNombre("Michael321");
        michael321.setPassword("hola4321");
        michael321.setSexo("Masculino");
        michael321.setEmail("michaelr@gmail.com");
        listaUsuarios.add(michael321);

        Alumno diana = new Alumno();
        diana.setId_alum(1);
        diana.setCurso("G1");
        diana.setNombre("Diana");
        diana321.getSexo();
        diana.setAsistencia(true);
        diana.setAsignatura("Java");
        listaAlumnos.add(diana);

        Alumno michael = new Alumno();
        michael.setId_alum(2);
        michael.setCurso("G1");
        michael.setNombre("Michael");
        michael321.getSexo();
        michael.setAsistencia(true);
        michael.setAsignatura("Java");
        listaAlumnos.add(michael);

        Profesor israel = new Profesor();
        israel.setAsignatura("JAVA");
        israel.setNombre("Israel");
        israel.setPrueba("HOLAMUNDO");
        israel.setDireccion("Av. Padre las casas 2309");
        israel.setTelefono("+56936748593");
        israel.setId_escuela("I01");
        israel.setAnioentrada(2022);
        israel.setCurriculum("Al dia");
        listaProfesores.add(israel);

        Profesor pamela = new Profesor();
        pamela.setAsignatura("JAVA");
        pamela.setNombre("Pamela");
        pamela.setPrueba("HOLAMUNDO uwu");
        pamela.setDireccion("Av. americo vespucio 234");
        pamela.setTelefono("+56936748555");
        pamela.setId_escuela("I01");
        pamela.setAnioentrada(2022);
        pamela.setCurriculum("Al dia");
        listaProfesores.add(pamela);


        System.out.println("************Generation************");
        System.out.println("Lista de estudiantes: ");

        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i).getNombre());
            System.out.println(listaAlumnos.get(i).toString());
        }
        System.out.println("**********************************");

        System.out.println("Lista de profesores: ");

        for (int i = 0; i < listaProfesores.size(); i++) {
            System.out.println(listaProfesores.get(i).getNombre());
            System.out.println(listaProfesores.get(i).toString());
        }

        System.out.println("**********************************");


        System.out.println("Lista de usuarios: ");
        for (int i = 0; i < listaUsuarios.size(); i++) {
            System.out.println(listaUsuarios.get(i).getNombre());
            System.out.println(listaUsuarios.get(i).toString());
        }

        System.out.println("**********************************");


    }

	}


