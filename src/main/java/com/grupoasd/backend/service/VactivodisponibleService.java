package com.grupoasd.backend.service;

import com.grupoasd.backend.entity.*;
import com.grupoasd.backend.repo.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VactivodisponibleService {
	@Autowired
	private VactivodisponibleJpaRepository repo;

	public List<Vactivodisponible> findAllVactivodisponible() {
		return repo.findAll();
	}
}
