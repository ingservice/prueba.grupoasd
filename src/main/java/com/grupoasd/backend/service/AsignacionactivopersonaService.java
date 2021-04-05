package com.grupoasd.backend.service;

import com.grupoasd.backend.entity.*;
import com.grupoasd.backend.repo.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignacionactivopersonaService {

	@Autowired
	private AsignacionactivopersonaJpaRepoitory repo;

	public List<Asignacionactivopersona> findAllAsignacionactivopersona() {
		return repo.findAll();
	}
	
	public Asignacionactivopersona saveAsignacionactivopersona(Asignacionactivopersona asignacionactivopersona) {
		return repo.save(asignacionactivopersona);
	}
	
	public void deleteAsignacionactivopersona(long idasignacionactivopersona) {
		repo.deleteById(idasignacionactivopersona);
	}
}
