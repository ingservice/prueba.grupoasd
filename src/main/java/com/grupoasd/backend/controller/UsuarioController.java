package com.grupoasd.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.grupoasd.backend.service.*;
import com.grupoasd.backend.entity.*;
import org.apache.commons.codec.digest.DigestUtils;
import java.net.URI;
import java.util.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UsuarioController {
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/authenticate")
	public ResponseEntity<Usuario> authenticationUser(@RequestHeader MultiValueMap<String, String> headers) {
		String usr = ((headers.containsKey("username") == true) ? headers.getFirst("username") : ""),
				pass = ((headers.containsKey("password") == true) ? headers.getFirst("password") : "");
		Usuario u = service.findByUsuarioAndClaveLogin(usr, pass);
		if(u!=null) {
			return new ResponseEntity<Usuario>(u, HttpStatus.OK);
		}
		return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);		
	}
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAllUsuario(){
		List<Usuario> la = service.findAllUsuario();
		if(!la.isEmpty() && la.size()>0) {
			return new ResponseEntity<List<Usuario>>(la,HttpStatus.OK);
		}
		return new ResponseEntity<List<Usuario>>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/usuarios")
	public ResponseEntity<Void> saveNewUsuario(@RequestBody Usuario user){
		user.setClave(DigestUtils.md5Hex(user.getClave()));
		Usuario userCreated = service.saveUsuario(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				  .path("{id}").buildAndExpand(userCreated.getIdusuario()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping("/usuarios/{idusuario}")
	public ResponseEntity<Usuario> updateUsuario(@PathVariable long idusuario, @RequestBody Usuario user){
		user.setIdusuario(idusuario);		
		Usuario userUpdate = service.saveUsuario(user);
		return new ResponseEntity<Usuario>(userUpdate, HttpStatus.OK);
	}
	
}
