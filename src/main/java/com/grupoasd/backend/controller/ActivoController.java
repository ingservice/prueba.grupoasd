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
public class ActivoController {
	@Autowired
	private ActivoService serviceac;
	
	@Autowired
	private VactivoService serviceav;
	
	@GetMapping("/activos")
	public ResponseEntity<List<Vactivo>> getAllVactivos(){
		List<Vactivo> la = serviceav.findAllVactivo();
		if(!la.isEmpty() && la.size()>0) {
			return new ResponseEntity<List<Vactivo>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Vactivo>>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/activos/tipo/{tipoactivo}")
	public ResponseEntity<List<Vactivo>> getVactivosByTipoactivo(@PathVariable String tipoactivo){	
		List<Vactivo> la = serviceav.findAllTipoActivo(tipoactivo);
		if(!la.isEmpty() && la.size()>0) {
			return new ResponseEntity<List<Vactivo>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Vactivo>>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/activos/fecha/{fechacompra}")
	public ResponseEntity<List<Vactivo>> getVactivosByFechacompra(@PathVariable java.sql.Date fechacompra){		
		List<Vactivo> la = serviceav.findAllFechacompra(fechacompra);
		if(!la.isEmpty() && la.size()>0) {
			return new ResponseEntity<List<Vactivo>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Vactivo>>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/activos/serial/{serialnumber}")
	public ResponseEntity<List<Vactivo>> getVactivosBySerial(@PathVariable String serialnumber){		 
		List<Vactivo> la = serviceav.findAllSerial(serialnumber);
		if(!la.isEmpty() && la.size()>0) {
			return new ResponseEntity<List<Vactivo>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Vactivo>>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/activos")
	public ResponseEntity<Void> saveActivo(@RequestBody Activo activo){
		Activo activoCreado = serviceac.saveActivo(activo);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				  .path("{id}").buildAndExpand(activoCreado.getIdactivo()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("/activos/{idactivo}")
	public ResponseEntity<Activo> saveActivo(@RequestBody Activo activo, @PathVariable long idactivo){
		activo.setIdactivo(idactivo);
		Activo activoUpdate = serviceac.saveActivo(activo);		
		return new ResponseEntity<Activo>(activoUpdate, HttpStatus.OK);
	}
	
}
