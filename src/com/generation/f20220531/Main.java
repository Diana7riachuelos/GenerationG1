package com.generation.f20220531;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.generation.f20220531.manager.ClienteManager;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//1
//capturamos datos y los llevamos a la lista de clientes		
//arreglo de clientes
	    
	    List<Cliente> listaCliente = new ArrayList<Cliente>();//2
	    int opcion =0;
	//instancia de cliente
		//dentro de un mismo package
		//no get ni set, aca va directo
		Cliente cliente = new Cliente();//3
	    cliente.setId(1234);
	    cliente.setNombre("Donato");
	    cliente.setRut("12345678-0");
	   
	    do {//4
	     
	  //excepciones
	    
	    Cliente clienteDatosDinamicos = new Cliente();
	    
	    System.out.println("Ingrese el id del cliente");//pasamos de estatico a dinamico
	    //Integer id2 = sc.nextInt();//aca capturamos
	    String idString = sc.nextLine();
	   
	    try {
	    	Integer id = Integer.parseInt(idString);//null es para probar error
	    	clienteDatosDinamicos.setId(id);//para probar error
	    	sc.nextLine();
	    	
	    //Integer division = 100/0;
	    //System.out.println(division);
	    System.out.println("Ingrese el nombre del cliente");
	    String nombre = sc.nextLine();
	    clienteDatosDinamicos.setNombre(nombre);
	    
	    System.out.println("Ingrese el rut del cliente");
	    String rut = sc.nextLine();
	    clienteDatosDinamicos.setRut(rut);
	    
	    System.out.println("Ingrese el correo del cliente");
	    String correo = sc.nextLine();
	    clienteDatosDinamicos.setCorreo(correo);
	    
	    
	    }catch(ArithmeticException ae) {
	    	System.out.println("Error al dividir por cero");
	    	
	    }catch (InputMismatchException ime) {
	    	System.out.println("Error en el ingreso de un dato");
	    	
		} catch (NumberFormatException nfe) {
			System.out.println("No puede ingresar una letra como identificador"+nfe);//+nfe e.getMessage() 
				
		}catch (Exception e) {
			System.out.println("Ha ocurrido un error, contecte al administrador "+e);
		}  
	    
	    //agregar el cliente a la lista
	    listaCliente.add(clienteDatosDinamicos);//agregar objeto cliente con los datos que agregamos
	    
	    //solicitando el repetir el ingreso de datos
	    do {
	  
	    System.out.println("Desea ingresar un nuevo cliente? (1) si (0) no");
	    opcion = sc.nextInt();
	    sc.nextLine();
	    }while(opcion < 0 || opcion > 1);
	    }while(opcion == 1);
	    
	    /**acceder al metodo de otra clase**/
	    //instancia de la clase ClienteManager
	    ClienteManager cm = new ClienteManager();//importamos, instanciamos
	    cm.recorrerArregloCliente(listaCliente);//llamamos la funcion creada en cliente manager
	    
	
	  	    
	//por cada objeto se debe crear una instancia
	     
			
	}

}
