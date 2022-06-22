package com.generation.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.models.Auto;
import com.generation.services.AutoService;



@RestController
@RequestMapping
public class ApiRestController {

	@Autowired //es una inyeccion de dependencia, traemos una clase para usarla internamente; llamado, traemos más cosas al restcontroller y hacemos uso de sus métodos
	AutoService autoService;
	
	//localhosta:8080/api/obtener/autos
	@RequestMapping("/obtener/autos")
	public List<Auto> obtenerListaAutos(){
	List<Auto> ListaAutos = autoService.findAll();
	return ListaAutos;
	}
	
}
