package com.generation.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Auto;

@Controller
@RequestMapping("/auto")
public class AutoController {
	
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
		}
		
		return "auto.jsp";
		
		
	}

}
