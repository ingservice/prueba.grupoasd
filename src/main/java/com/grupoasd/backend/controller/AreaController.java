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
public class AreaController {
	@Autowired
	private AreaService service;
	
	@GetMapping("/areas")
	public ResponseEntity<List<Area>> getAllArea() {		
		List<Area> la = service.findAllArea();
		if(!la.isEmpty() && la.size()>0) {
			return new ResponseEntity<List<Area>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Area>>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/areas/ciudad/{idciudad}")
	public ResponseEntity<List<Area>> getByIdCiudad(@PathVariable long idciudad) { 
		List<Area> la = service.findByCiudad(idciudad);
		if(!la.isEmpty() && la.size()>0) {
			return new ResponseEntity<List<Area>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Area>>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/areas/area/{idarea}")
	public ResponseEntity<Area> getByIdArea(@PathVariable long idarea) {		
		Area la = service.findByIdArea(idarea);
		if(la!=null) {
			return new ResponseEntity<Area>(la, HttpStatus.OK);
		}
		return new ResponseEntity<Area>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/areas/nombrearea/{nombrearea}")
	public ResponseEntity<Area> getByname(String nombrearea) {		
		Area la = service.findByname(nombrearea);
		if(la!=null) {
			return new ResponseEntity<Area>(la, HttpStatus.OK);
		}
		return new ResponseEntity<Area>(HttpStatus.NOT_FOUND);
	}	
	
	@PostMapping("/areas")
	public ResponseEntity<Void> saveArea(@RequestBody Area area) {
		Area areaCreated = service.saveArea(area);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(areaCreated.getIdarea()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping("/areas/{idarea}")
	public ResponseEntity<Area> updateCiudad(@RequestBody Area area,
			@PathVariable long idarea) {
		area.setIdarea(idarea);
		Area areaUpdate = service.saveArea(area);
		return new ResponseEntity<Area>(areaUpdate, HttpStatus.OK);
	}	
}
