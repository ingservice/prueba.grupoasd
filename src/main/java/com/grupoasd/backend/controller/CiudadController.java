package com.grupoasd.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.grupoasd.backend.service.*;
import com.grupoasd.backend.entity.*;
import java.net.URI;
import java.util.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CiudadController {
	@Autowired
	private CiudadService service;
	
	@GetMapping("/ciudades")
	public ResponseEntity<List<Ciudad>> getAllCiudades() {		
		List<Ciudad> la = service.findAllCiudades();
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Ciudad>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Ciudad>>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/ciudades/{iddepartamento}")
	public ResponseEntity<List<Ciudad>> getAllByDepartamento(@PathVariable long iddepartamento) {
		List<Ciudad> la = service.findAllByDepartamento(iddepartamento);
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Ciudad>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Ciudad>>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/ciudades/ciudad/{nombreciudad}")
	public ResponseEntity<Ciudad> getByNameCiudad(@PathVariable String nombreciudad) {
		Ciudad la = service.findByNameCiudad(nombreciudad);
		if (la!=null) {
			return new ResponseEntity<Ciudad>(la, HttpStatus.OK);
		}
		return new ResponseEntity<Ciudad>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/ciudades/ciudad/{codigodane}")
	public ResponseEntity<Ciudad> getByCodigoDaneCiudad(@PathVariable String codigodane) {
		Ciudad la = service.findByCodigoDaneCiudad(codigodane);
		if (la!=null) {
			return new ResponseEntity<Ciudad>(la, HttpStatus.OK);
		}
		return new ResponseEntity<Ciudad>(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/ciudades")
	public ResponseEntity<Void> saveCiudad(@RequestBody Ciudad ciudad) {
		Ciudad ciudadCreated = service.saveCiudad(ciudad);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(ciudadCreated.getIdciudad()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping("/ciudades/{idciudad}")
	public ResponseEntity<Ciudad> updateCiudad(@RequestBody Ciudad ciudad,
			@PathVariable long idciudad) {
		ciudad.setIdciudad(idciudad);
		Ciudad ciudadUpdate = service.saveCiudad(ciudad);
		return new ResponseEntity<Ciudad>(ciudadUpdate, HttpStatus.OK);
	}	
	
}
