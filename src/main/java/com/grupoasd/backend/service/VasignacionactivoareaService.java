package com.grupoasd.backend.service;

import com.grupoasd.backend.entity.*;
import com.grupoasd.backend.repo.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VasignacionactivoareaService {
	@Autowired
	private VasignacionactivoareaJpaRepository repo;

	public List<Vasignacionactivoarea> findAllVasignacionactivoarea() {
		return repo.findAll();
	}

	public List<Vasignacionactivoarea> findByArea(String area) {
		return repo.findByArea(area);
	}

	public List<Vasignacionactivoarea> findByUsuario(String usuario) {
		return repo.findByUsuario(usuario);
	}

	public List<Vasignacionactivoarea> findByFechaasignacion(java.sql.Date fechaasignacion) {
		return repo.findByFechaasignacion(fechaasignacion);
	}
}
