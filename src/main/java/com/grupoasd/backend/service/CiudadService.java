package com.grupoasd.backend.service;

import com.grupoasd.backend.entity.*;
import com.grupoasd.backend.repo.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadService {

	@Autowired
	private CiudadJpaRepository repo;

	public List<Ciudad> findAllCiudades() {
		return repo.findAll();
	}
	
	public List<Ciudad> findAllByDepartamento(long iddepartamento) {
		return repo.findByIddepartamento(iddepartamento);
	}

	public Ciudad saveCiudad(Ciudad ciudad) {
		return repo.save(ciudad);
	}

	public void deleteById(long idciudad) {
		repo.deleteById(idciudad);
	}

	public Ciudad findByNameCiudad(String ciudad) {
		return repo.findByCiudad(ciudad);
	}

	public Ciudad findByCodigoDaneCiudad(String codigodane) {
		return repo.findByCodigodane(codigodane);
	}
	
}
