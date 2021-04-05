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
public class PersonaController {
	@Autowired
	private PersonaService service;

	@GetMapping("/personas")
	public ResponseEntity<List<Persona>> getAllPersona() {		
		List<Persona> lp = service.findAllPersona(); 
		if(!lp.isEmpty() && lp.size()>0) {
			return new ResponseEntity<List<Persona>>(lp,HttpStatus.OK);
		}
		return new ResponseEntity<List<Persona>>(HttpStatus.NOT_FOUND); 
	}

	@GetMapping("/personas/apellido/{apellido}")
	public ResponseEntity<List<Persona>> getByApellidosPersona(@PathVariable String apellido) {		
		List<Persona> lp = service.findByApellidosPersona(apellido);
		if(!lp.isEmpty() && lp.size()>0) {
			return new ResponseEntity<List<Persona>>(lp,HttpStatus.OK);
		}
		return new ResponseEntity<List<Persona>>(HttpStatus.NOT_FOUND); 
	}

	@GetMapping("/personas/nombre/{nombre}")
	public ResponseEntity<List<Persona>> getByNombresPersona(@PathVariable String nombre) {		
		List<Persona> lp = service.findByNombresPersona(nombre);
		if(!lp.isEmpty() && lp.size()>0) {
			return new ResponseEntity<List<Persona>>(lp,HttpStatus.OK);
		}
		return new ResponseEntity<List<Persona>>(HttpStatus.NOT_FOUND); 
	}

	@GetMapping("/personas/area/{idarea}")
	public ResponseEntity<List<Persona>> getByIdAreaPersona(@PathVariable long idarea) {
		List<Persona> lp = service.findByIdAreaPersona(idarea); 
		if(!lp.isEmpty() && lp.size()>0) {
			return new ResponseEntity<List<Persona>>(lp,HttpStatus.OK);
		}
		return new ResponseEntity<List<Persona>>(HttpStatus.NOT_FOUND); 
	}

	@GetMapping("/personas/persona/{identificacion}")
	public ResponseEntity<Persona> getByIdentificacionPersona(@PathVariable String identificacion) {
		Persona p = service.findByIdentificacionPersona(identificacion); 
		if(p!=null) {
			return new ResponseEntity<Persona>(p,HttpStatus.OK);
		}
		return new ResponseEntity<Persona>(HttpStatus.NOT_FOUND); 
	}

	@PostMapping("/personas")
	public ResponseEntity<Void> savePersona(@RequestBody Persona persona) {
		Persona personaCreated = service.savePersona(persona);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(personaCreated.getIdpersona()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping("/personas/{idpersona}")
	public ResponseEntity<Persona> updateCiudad(@RequestBody Persona persona, @PathVariable long idpersona) {
		persona.setIdpersona(idpersona);
		Persona personaUpdate = service.savePersona(persona);
		return new ResponseEntity<Persona>(personaUpdate, HttpStatus.OK);
	}

}
