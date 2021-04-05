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
public class DepartamentoController {
	@Autowired
	private DepartamentoService service;

	@GetMapping("/departamentos")
	public ResponseEntity<List<Departamento>> getAllDepartamento() {
		List<Departamento> la = service.findAllDepartamento();
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Departamento>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Departamento>>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/departamentos/pais/{idpais}")
	public ResponseEntity<List<Departamento>> getDepartamentoByIdpais(@PathVariable long idpais) {
		List<Departamento> la = service.findByIdPaisDepartamento(idpais);
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Departamento>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Departamento>>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/departamentos/departamento/{nombre}")
	public ResponseEntity<Departamento> getDepartamentoByNombre(@PathVariable String nombre) {
		Departamento la = service.findBynameDepartamento(nombre);
		if (la!=null) {
			return new ResponseEntity<Departamento>(la, HttpStatus.OK);
		}
		return new ResponseEntity<Departamento>(HttpStatus.NOT_FOUND);	
	}

	@PostMapping("/departamentos")
	public ResponseEntity<Void> saveDepartamento(@RequestBody Departamento departamento) {
		Departamento dptoCreated = service.saveDepartamento(departamento);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(dptoCreated.getIddepartamento()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping("/departamentos/{iddepartamento}")
	public ResponseEntity<Departamento> updateDepartamento(@RequestBody Departamento departamento,
			@PathVariable long iddepartamento) {
		departamento.setIddepartamento(iddepartamento);
		Departamento dptoUpdate = service.saveDepartamento(departamento);
		return new ResponseEntity<Departamento>(dptoUpdate, HttpStatus.OK);
	}

}
