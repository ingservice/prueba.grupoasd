package com.grupoasd.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grupoasd.backend.entity.*;
import com.grupoasd.backend.repo.AreaJpaRepository;
import java.util.*;

@Service
public class AreaService {

	@Autowired
	private AreaJpaRepository repo;

	public List<Area> findAllArea() {
		return repo.findAll();
	}
	
	public List<Area> findByCiudad(long idciudad) {
		return repo.findByIdciudad(idciudad);
	}

	public Area saveArea(Area area) {
		return repo.save(area);
	}

	public Area findByIdArea(long idarea) {
		return repo.findByIdarea(idarea);
	}

	public Area findByname(String area) {
		return repo.findByArea(area);
	}	

	public void deleteArea(long idarea) {
		repo.deleteById(idarea);
	}
}
