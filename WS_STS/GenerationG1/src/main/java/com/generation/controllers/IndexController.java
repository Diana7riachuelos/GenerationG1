package com.generation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Usuario;


@Controller  //ruta controlador
public class IndexController {
	//ruta http://localhost:8080/
	@RequestMapping("/")//captura las rutas
	public String index(Model model) {
		model.addAttribute("apellido", "Miranda");
		model.addAttribute("nombre", "Diana ");
		model.addAttribute("edad", "27 ");
		model.addAttribute("Universo", "Erase una vez un perrito ");
//instancia de usuario
	Usuario usuario = new Usuario("Donato","Loren",12,"Admin1234*");
	//pasando el objeto a la vista (JSP)
	model.addAttribute("usuario",usuario);
	
	System.out.println(usuario.getEdad());
		return "index.jsp";

	}
	

	
}
