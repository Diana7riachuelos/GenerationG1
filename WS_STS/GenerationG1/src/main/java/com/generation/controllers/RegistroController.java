package com.generation.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Usuario;
import com.generation.services.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegistroController {
//ruta para desplegar el jsp
	
	
//inyeccion de dependencias
@Autowired 	
UsuarioService usuarioService;


@RequestMapping("")
public String registro(@ModelAttribute("usuario") Usuario usuario) {
	
	return "registro.jsp"; //la pagina a deplegar
	
}
	@PostMapping("/usuario/respaldo")
public String registroUsuario(@RequestParam(value="gato")String nombre,
		@RequestParam(value="apellido")String apellido,
		@RequestParam(value="edad")String edad
		) {
		System.out.println("parametro gato"+nombre);
		System.out.println("parametro apellido"+apellido);
		System.out.println("parametro edad"+edad);
	return "registro.jsp";//la pagina a desplegar
  }
	
	@PostMapping("/usuario")
	public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario,
			BindingResult resultado,
			Model model) {
		
	if(resultado.hasErrors()) {//capturamos si existe un error en el registro de datos desde el jsp
	model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
		return "registro.jsp";
		}
		
	
	System.out.println(usuario.getNombre()+" "+usuario.getApellido()+ " "+ usuario.getEdad());  
	
	//iremos hacia la base de datos, enviaremos el objeto al service
	usuarioService.saveUsuario(usuario);
	
	return "index.jsp";
}
	
	}



