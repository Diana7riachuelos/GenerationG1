package com.generation.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Auto;
import com.generation.repositories.AutoRepository;

import antlr.collections.List;

@Service
public class AutoService {
 @Autowired
 AutoRepository autoRepository;

 public void guardarAuto(@Valid Auto auto) {
	 autoRepository.save(auto);
 }
 //obtener una lista de autos
 public List<Auto> findAll(){
	 
	 return autoRepository.findAll();
	 
 }
}
