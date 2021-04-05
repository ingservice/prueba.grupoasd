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
public class PaisController {
	@Autowired
	private PaisService service;
	
	@GetMapping("/paises")
	public  ResponseEntity<List<Pais>> findAllPaises(){
		List<Pais> la = service.findAllPaises();
		if (!la.isEmpty() && la.size() > 0) {
			return new ResponseEntity<List<Pais>>(la, HttpStatus.OK);
		}
		return new ResponseEntity<List<Pais>>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/paises/nombre/{pais}")
	public  ResponseEntity<Pais> findByPais(@PathVariable String pais){
		Pais la = service.findByNamePais(pais);
		if (la!=null) {
			return new ResponseEntity<Pais>(la, HttpStatus.OK);
		}
		return new ResponseEntity<Pais>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/paises/codigo/{codigoiso}")
	public ResponseEntity<Pais> findByCodigoiso(@PathVariable int codigoiso){
		Pais la = service.findByCodigoIsoPais(codigoiso);
		if (la!=null) {
			return new ResponseEntity<Pais>(la, HttpStatus.OK);
		}
		return new ResponseEntity<Pais>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/paises")
	public ResponseEntity<Void> savePais(@RequestBody Pais pais){
		Pais paisCreated = service.savePais(pais);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				  .path("{id}").buildAndExpand(paisCreated.getIdpais()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("/paises/{idpais}")
	public ResponseEntity<Pais> updatePais(@RequestBody Pais pais, @PathVariable long idpais){
		pais.setIdpais(idpais);
		Pais paisUpdate = service.savePais(pais);
		return new ResponseEntity<Pais>(paisUpdate, HttpStatus.OK);
	}
	
}
