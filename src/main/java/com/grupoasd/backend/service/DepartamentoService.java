package com.grupoasd.backend.service;

import com.grupoasd.backend.entity.*;
import com.grupoasd.backend.repo.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService {
	@Autowired
	private DepartamentoJpaRepository repo;

	public List<Departamento> findAllDepartamento() {
		return repo.findAll();
	}

	public List<Departamento> findByIdPaisDepartamento(long idpais) {
		return repo.findByIdpais(idpais);
	}

	public Departamento findBynameDepartamento(String Departamento) {
		return repo.findByDepartamento(Departamento);
	}

	public Departamento findByCodigoDaneDepartamento(String codigodane) {
		return repo.findByCodigodane(codigodane);
	}

	public Departamento saveDepartamento(Departamento departamento) {
		return repo.save(departamento);
	}

	public void deleteByIdDepartamento(long iddepartamento) {
		repo.deleteById(iddepartamento);
	}

}
