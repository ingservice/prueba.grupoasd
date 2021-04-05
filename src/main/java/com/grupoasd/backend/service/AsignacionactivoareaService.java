package com.grupoasd.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grupoasd.backend.repo.*;
import com.grupoasd.backend.entity.*;
import java.util.*;

@Service
public class AsignacionactivoareaService {
	
	@Autowired
	private AsignacionactivoareaJpaRepository repo;
	
	public List<Asignacionactivoarea> findAllAsignacionactivoarea(){
		return repo.findAll();
	}
	
	public Asignacionactivoarea saveAsignacionactivoarea(Asignacionactivoarea asignacionactivoarea) {
		return repo.save(asignacionactivoarea);
	}
	
	public void deleteAsignacionactivoarea(long idasignacionactivoarea) {
		repo.deleteById(idasignacionactivoarea);
	}
}
