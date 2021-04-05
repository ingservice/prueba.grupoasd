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
public class TipoactivoController {
	@Autowired
	private TipoactivoService service;
	
	@GetMapping("/tipoactivos")
	public ResponseEntity<List<Tipoactivo>> getAllTipoactivo(){
		List<Tipoactivo> la = service.findAllTipoactivo();
		if(la!=null) {
			return new ResponseEntity<List<Tipoactivo>>(la,HttpStatus.OK);
		}
		return new ResponseEntity<List<Tipoactivo>>(HttpStatus.NOT_FOUND); 
	}
	
	@GetMapping("/tipoactivos/{tipoactivo}")
	public ResponseEntity<Tipoactivo> getByIdtipoactivo(@PathVariable String tipoactivo){
		Tipoactivo la = service.findByNameTipoActivo(tipoactivo);
		if(la!=null) {
			return new ResponseEntity<Tipoactivo>(la,HttpStatus.OK);
		}
		return new ResponseEntity<Tipoactivo>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/tipoactivos")
	public ResponseEntity<Void> createTipoActivo(@RequestBody Tipoactivo tipoactivo){
		Tipoactivo tipoCreated = service.saveTipoactivo(tipoactivo);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				  .path("{id}").buildAndExpand(tipoCreated.getIdtipoactivo()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("/tipoactivos/{idtipoactivo}")
	public ResponseEntity<Tipoactivo> updateTipoactivo(@PathVariable long idtipoactivo, @RequestBody Tipoactivo tipoactivo){
		tipoactivo.setIdtipoactivo(idtipoactivo);
		Tipoactivo tipoUpdate = service.saveTipoactivo(tipoactivo);
		return new ResponseEntity<Tipoactivo>(tipoUpdate,HttpStatus.OK);
	}
	
}
