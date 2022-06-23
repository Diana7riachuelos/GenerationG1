package com.generation.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Licencia;
import com.generation.repositories.LicenciaRepository;

@Service
public class LicenciaService {
	@Autowired
	LicenciaRepository licenciaRepository;
	public void save(@Valid Licencia licencia) {
    //almacenar en base de datos la licencia
   
    licenciaRepository.save(licencia);
		
		
	}
	public List<Licencia> findAll() {
		// TODO Auto-generated method stub
		return licenciaRepository.findAll();
	}

}
