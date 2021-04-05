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
public class AsignacionactivoareaController {

	@Autowired
	private AsignacionactivoareaService serviceas;

	@Autowired
	private VasignacionactivoareaService servicevs;

	@GetMapping("/asignacionesareas")
	public ResponseEntity<List<Vasignacionactivoarea>> getAllVasignacionactivoarea() {
		List<Vasignacionactivoarea> la = servicevs.findAllVasignacionactivoarea();
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Vasignacionactivoarea>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Vasignacionactivoarea>>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/asignacionesareas/area/{area}")
	public ResponseEntity<List<Vasignacionactivoarea>> getByArea(@PathVariable String area) {		
		List<Vasignacionactivoarea> la = servicevs.findByArea(area);
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Vasignacionactivoarea>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Vasignacionactivoarea>>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/asignacionesareas/usuario/{usuario}")
	public ResponseEntity<List<Vasignacionactivoarea>> getByUsuario(@PathVariable String usuario) {		
		List<Vasignacionactivoarea> la = servicevs.findByUsuario(usuario);
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Vasignacionactivoarea>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Vasignacionactivoarea>>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/asignacionesareas/fecha/{fecha}")
	public ResponseEntity<List<Vasignacionactivoarea>> getByFechaasignacion(java.sql.Date fechaasignacion) {		
		List<Vasignacionactivoarea> la = servicevs.findByFechaasignacion(fechaasignacion);
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Vasignacionactivoarea>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Vasignacionactivoarea>>(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/asignacionesareas")
	public ResponseEntity<Void> saveAsignacionactivoarea(@RequestBody Asignacionactivoarea asignacionactivoarea) {
		Asignacionactivoarea asignacionactivoareaCreated = serviceas.saveAsignacionactivoarea(asignacionactivoarea);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(asignacionactivoareaCreated.getIdasignacionactivo()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping("/asignacionesareas/{idasignacionactivo}")
	public ResponseEntity<Asignacionactivoarea> updateCiudad(@RequestBody Asignacionactivoarea asignacionactivoarea,
			@PathVariable long idasignacionactivo) {
		asignacionactivoarea.setIdasignacionactivo(idasignacionactivo);
		Asignacionactivoarea asignacionactivoareaUpdate = serviceas.saveAsignacionactivoarea(asignacionactivoarea);
		return new ResponseEntity<Asignacionactivoarea>(asignacionactivoareaUpdate, HttpStatus.OK);
	}

	@DeleteMapping("/asignacionesareas/{idasignacionactivo}")
	public ResponseEntity<Void> deleteAsignacionactivoarea(@PathVariable long idasignacionactivoarea) {
		serviceas.deleteAsignacionactivoarea(idasignacionactivoarea);
		return ResponseEntity.noContent().build();

	}

}
