package com.grupoasd.backend.service;

import com.grupoasd.backend.entity.*;
import com.grupoasd.backend.repo.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VasignacionactivopersonaService {
	@Autowired
	private VasignacionactivopersonaJpaRepository repo;

	public List<Vasignacionactivopersona> findAllVasignacionactivopersona() {
		return repo.findAll();
	}

	public List<Vasignacionactivopersona> findByPersona(String persona) {
		return repo.findByPersona(persona);
	}

	public List<Vasignacionactivopersona> findByUsuario(String usuario) {
		return repo.findByUsuario(usuario);
	}

	public List<Vasignacionactivopersona> findByFechaasignacion(java.sql.Date fechaasignacion) {
		return repo.findByFechaasignacion(fechaasignacion);
	}
}
