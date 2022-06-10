package com.generation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //ruta controlador
public class IndexController {
	//ruta http://localhost:8080/
	@RequestMapping("/")//captura las rutas
	public String index() {
	return "Hola mundo g1";

	}
	
	//http://localhost:8080/usuario
	//@RequestMapping("/usuario")
	
}
