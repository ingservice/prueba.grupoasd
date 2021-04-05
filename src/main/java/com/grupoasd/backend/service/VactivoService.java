package com.grupoasd.backend.service;

import com.grupoasd.backend.entity.*;
import com.grupoasd.backend.repo.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VactivoService {
	@Autowired
	private VactivoJpaRepository repo;

	public List<Vactivo> findAllVactivo() {
		return repo.findAll();
	}
	
	public List<Vactivo> findAllTipoActivo(String tipoactivo) {
		return repo.findByTipoactivo(tipoactivo);
	}
	
	public List<Vactivo> findAllFechacompra(java.sql.Date fechacompra) {
		return repo.findByFechacompra(fechacompra);
	}
	
	public List<Vactivo> findAllSerial(String serial) {
		return repo.findBySerial(serial);
	}
}
