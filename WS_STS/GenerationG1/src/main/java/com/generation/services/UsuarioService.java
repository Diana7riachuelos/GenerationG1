package com.generation.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Usuario;
import com.generation.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	public void saveUsuario(@Valid Usuario usuario) {
		usuarioRepository.save(usuario);
		// TODO Auto-generated method stub
		
	}
	
 /** Logica de negocio o validaciones del sistema**/
/**llamar al repository (inyeccion de dependencia)**/

	
		
	}
	
	

