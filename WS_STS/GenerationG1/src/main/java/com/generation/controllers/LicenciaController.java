package com.generation.controllers;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Licencia;
import com.generation.models.Usuario;
import com.generation.services.LicenciaService;
import com.generation.services.UsuarioService;

@Controller
@RequestMapping("/licencia")
public class LicenciaController {
 @Autowired
 LicenciaService licenciaService;
 
 @Autowired
 UsuarioService usuarioService;
 
	 @RequestMapping("")
	 public String despliegue(Model model) {
		 Licencia licencia = new Licencia();
		 //licencia.setEstado("activo");
		 model.addAttribute("licencia", new Licencia());
		 List<Usuario> listaUsuarios = usuarioService.findAll();
		 model.addAttribute("listaUsuarios", listaUsuarios);
		 //enviar al jsp de licencias
		
		 List<Licencia> listaLicencias = licenciaService.findAll();
		 model.addAttribute("listaLicencias", listaLicencias);
		 
		 Date fechaActual= new Date();
		 
		 
		 return "licencia.jsp";
	 }
	 @PostMapping("/guardar")
	 public String guardarLicencia(@Valid @ModelAttribute("licencia") Licencia licencia
			 ) {
	licenciaService.save(licencia);	 
	return "redirect:/licencia";
	 }
}
