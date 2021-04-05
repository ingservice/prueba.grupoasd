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
public class AsignacionactivopersonaController {

	@Autowired
	private AsignacionactivopersonaService serviceas;

	@Autowired
	private VasignacionactivopersonaService servicevs;
	
	@GetMapping("/asignacionespersonas")
	public ResponseEntity<List<Vasignacionactivopersona>> getAllVasignacionactivopersona() {
		List<Vasignacionactivopersona> la = servicevs.findAllVasignacionactivopersona();
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Vasignacionactivopersona>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Vasignacionactivopersona>>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/asignacionespersonas/persona/{persona}")
	public ResponseEntity<List<Vasignacionactivopersona>> getBypersona(@PathVariable String persona) {		
		List<Vasignacionactivopersona> la = servicevs.findByPersona(persona);
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Vasignacionactivopersona>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Vasignacionactivopersona>>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/asignacionespersonas/usuario/{usuario}")
	public ResponseEntity<List<Vasignacionactivopersona>> getByUsuario(@PathVariable String usuario) {		
		List<Vasignacionactivopersona> la = servicevs.findByUsuario(usuario);
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Vasignacionactivopersona>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Vasignacionactivopersona>>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/asignacionespersonas/fecha/{fecha}")
	public ResponseEntity<List<Vasignacionactivopersona>> getByFechaasignacion(java.sql.Date fechaasignacion) {		
		List<Vasignacionactivopersona> la = servicevs.findByFechaasignacion(fechaasignacion);
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Vasignacionactivopersona>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Vasignacionactivopersona>>(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/asignacionespersonas")
	public ResponseEntity<Void> saveAsignacionactivopersona(@RequestBody Asignacionactivopersona asignacionactivopersona) {
		Asignacionactivopersona asignacionactivopersonaCreated = serviceas.saveAsignacionactivopersona(asignacionactivopersona);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(asignacionactivopersonaCreated.getIdasignacionactivopersona()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping("/asignacionespersonas/{idasignacionactivopersona}")
	public ResponseEntity<Asignacionactivopersona> updateCiudad(@RequestBody Asignacionactivopersona asignacionactivopersona,
			@PathVariable long idasignacionactivopersona) {
		asignacionactivopersona.setIdasignacionactivopersona(idasignacionactivopersona);
		Asignacionactivopersona asignacionactivopersonaUpdate = serviceas.saveAsignacionactivopersona(asignacionactivopersona);
		return new ResponseEntity<Asignacionactivopersona>(asignacionactivopersonaUpdate, HttpStatus.OK);
	}

	@DeleteMapping("/asignacionespersonas/{idasignacionactivopersona}")
	public ResponseEntity<Void> deleteAsignacionactivopersona(@PathVariable long idasignacionactivopersona) {
		serviceas.deleteAsignacionactivopersona(idasignacionactivopersona);
		return ResponseEntity.noContent().build();

	}

}
