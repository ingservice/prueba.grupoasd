package com.grupoasd.backend.service;

import com.grupoasd.backend.entity.*;
import com.grupoasd.backend.repo.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoactivoService {
	@Autowired
	private TipoactivoJpaRepository repo;

	public List<Tipoactivo> findAllTipoactivo() {
		return repo.findAll();
	}

	public Tipoactivo saveTipoactivo(Tipoactivo tipoactivo) {
		return repo.save(tipoactivo);
	}

	public void deleteByIdTipoactivo(long idtipoactivo) {
		repo.deleteById(idtipoactivo);
	}

	public Tipoactivo findByNameTipoActivo(String tipoactivo) {
		return repo.findByDescripcion(tipoactivo);
	}
}
