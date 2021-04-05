package com.grupoasd.backend.service;

import com.grupoasd.backend.entity.*;
import com.grupoasd.backend.repo.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService {
	@Autowired
	private PaisJpaRepository repo;

	public List<Pais> findAllPaises() {
		return repo.findAll();
	}

	public Pais savePais(Pais pais) {
		return repo.save(pais);
	}

	public void deleteByIdPais(long idpais) {
		repo.deleteById(idpais);
	}

	public Pais findByNamePais(String pais) {
		return repo.findByPais(pais);
	}

	public Pais findByCodigoIsoPais(int codigoiso) {
		return repo.findByCodigoiso(codigoiso);
	}
}
