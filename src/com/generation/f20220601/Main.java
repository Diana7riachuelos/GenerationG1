package com.generation.f20220601;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;

public class Main {

	public static void main(String[] args) {
		
		//acciones a diferenciar, saber averiguar los atributos.
		// herencia, heredar datos comunes, y que no se parezcan en nada, hay atributos comunes, y otras para diferenciar, dependiendo del punto desde donde lo veamos, atributo de colaboración.
		
		//aqui solo instancias y llamados
		
		//instancia de mascota
		Mascota mascota = new Mascota();
		mascota.setColor("gris");
		mascota.setNombre("tom");
		
		
		//instancia de perro
		Perro perro = new Perro();
		perro.setColor("RedFaund");
		perro.setNombre("Ayun");
		
		Gato gato = new Gato();
		gato.setEspecie("Felino");
		gato.setPelaje("pelo");
		gato.setPeso(3);
		
		System.out.println(gato.toString());
		
		
		Mishi mishi = new Mishi(true);
		System.out.println(mishi.toString()); //el del padre, el gato, 
		
	//si no está habilitado una clase, es decir comentada, entonces salta al anterior en herencia.
		//verificar el orden de escritura.
		//implementar acciones de otro lugar-Implement(cuando vimos array list)implementar una clase. Lo veremos después.
		//super es ir a la superior.
		
      /*polimorfismo*/
		List<Mascota> ListaMascotas = new ArrayList<Mascota>();
	    Mascota regalon = new Mascota("Negro", "Canes", "Pelo", "Firulais", 1.5f, "Macho");//f falta con punto no coma
	    ListaMascotas.add(regalon);
	    
	    Mascota felix = new Gato();
	    felix.setNombre("Felix");
	    felix.setColor("Negro");
	    felix.setPeso(3);
	    ListaMascotas.add(felix);
	    
	    Mascota chocolo = new Perro();
	    chocolo.setNombre("Chocolo");
	    chocolo.setColor("Cafe");
	    chocolo.setPeso(10);//habia escrito con mayuscula chocolo por eso me salio error
	    ListaMascotas.add(chocolo);
	    
	    System.out.println("*****");
	    
	    regalon.hacerSonido();//llamado al metodo
	    felix.hacerSonido();
	    chocolo.hacerSonido();
		
	    System.out.println("*****");
	    //recorrer el arreglo
	    for (Mascota mascota2 : ListaMascotas) {
	    	mascota2.hacerSonido();
	    	
		//hasta aca se hizo una sobrecarga de método
	    
	    	
		}
		
	   //transformar el objeto a uno especifico
	    Perro perroChocolo = (Perro) chocolo;
	    perroChocolo.setCantPaseos(6);
	    
	}

}
