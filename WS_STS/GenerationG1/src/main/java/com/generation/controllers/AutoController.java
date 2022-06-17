package com.generation.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Auto;
import com.generation.services.AutoService;

import antlr.collections.List;

@Controller
@RequestMapping("/auto")
public class AutoController {
	@Autowired
	AutoService autoService;
	
	@RequestMapping("")
	public String inicio(@ModelAttribute("auto")Auto auto) {
		return "auto.jsp";
	}
	@RequestMapping("/guardar")
	public String guardarAuto(@Valid @ModelAttribute("auto")Auto auto,
			BindingResult resultado,
			Model model) {
		
		if(resultado.hasErrors()) {
			model.addAttribute("msgError","Datos erroneos");
			return "auto.jsp";
		}else {
			//enviamos el objeto a persistir en base de datos
			autoService.guardarAuto(auto);
			//obtener una lista de autos
			List<Auto> ListaAutos = autoService.findAll();
			//pasamos la lista de autos al jsp
			model.addAttribute("autosCapturados", listaAutos);
			return "mostrarAutos2.jsp";//***le agregue el 2
		}
		
		
		
		
	}

}
