package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {
	public static void main(String[] args) {
		// colecciones Map
		//Pares clave <-> valor
		//HashMap<K, V> map = new HashMap<K, V>();
		//k key o clave; V value o valor
		//HashMap mapa = new HashMap();
		
		//HashMap<String, String> objHashMap = new HashMap<>();
		HashMap objHashMap = new HashMap();
		String nombre = "Alexis";
		
		objHashMap.put("Nombre", nombre);
		objHashMap.put("ApellidoP", "Palma");
		objHashMap.put("ApellidoM", "Quezada");
		objHashMap.put("Edad", "42");
		
		System.out.println("Elementos del mapa");
		System.out.println(objHashMap);
		
		//obtener un valor a traves de la clave
		System.out.println(objHashMap.get("ApellidoM"));
		
		//eliminar par
		objHashMap.remove("Edad");
		System.out.println(objHashMap);//imprimiendo el mapa
		
		//mostrar todas las llaves disponibles
		System.out.println(objHashMap.keySet());
		
		//mostrar todos los valores en el mapa
		System.out.println(objHashMap.values());
		
		ArrayList<String> vocales = new ArrayList<String>();
		vocales.add("a");
		vocales.add("e");
		vocales.add("i");
		vocales.add("o");
		vocales.add("u");
		
		
		//objHashMap.put("Vocales",vocales);
		System.out.println(objHashMap);
		
		// si no encuentra la clave, retorna un null
		System.out.println(objHashMap.get("vocales"));
		
		//crear un menu de comida
		//solicitar al usuario que elija el plato
		//imprimimos el plato
		
		//como recorrer un hasmap

		
		for(Object clave : objHashMap.keySet()) {
			System.out.println("clave: "+clave +" - valor: "+objHashMap.get(clave));
			
		
	
		}
		
		
	}
	

}
