package com.generation.f20220531.manager;

import java.util.List;

import com.generation.f20220531.Cliente;

//logica de negocio
public class ClienteManager {
	
	//recorrer el arreglo e imprimir
	
	public void recorrerArregloCliente(List<Cliente> listaCliente ) {//funcion que no retorna (void?), recibe lista desde otra clase
		
	for (Cliente cliente : listaCliente) {
		System.out.println(cliente.getNombre());
		
	}	
		
	}

	
	}


