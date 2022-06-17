package com.generation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.repositories.AutoRepository;

@Service
public class AutoService {
 @Autowired
 AutoRepository autoRepository;
 
}
