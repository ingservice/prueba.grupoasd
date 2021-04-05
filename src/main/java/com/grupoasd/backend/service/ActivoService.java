package com.grupoasd.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grupoasd.backend.entity.*;

import com.grupoasd.backend.repo.ActivoJpaRepository;

@Service
public class ActivoService {
	
	@Autowired
	private ActivoJpaRepository repo;	
	
	public Activo saveActivo(Activo activo) {
		return repo.save(activo);
	}
	
	public Activo findById(long idactivo) {
		return repo.getOne(idactivo);
	}
	
	public void deleteActivo(long idactivo) {
		repo.deleteById(idactivo);
	}
	
}
