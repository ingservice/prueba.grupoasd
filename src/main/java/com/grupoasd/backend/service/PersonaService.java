package com.grupoasd.backend.service;

import com.grupoasd.backend.entity.*;
import com.grupoasd.backend.repo.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
	@Autowired
	private PersonaJpaRepository repo;

	public List<Persona> findAllPersona() {
		return repo.findAll();
	}

	public List<Persona> findByApellidosPersona(String apellido) {
		return repo.findByApellido(apellido);
	}

	public List<Persona> findByNombresPersona(String nombre) {
		return repo.findByNombre(nombre);
	}

	public List<Persona> findByIdAreaPersona(long idarea) {
		return repo.findByIdarea(idarea);
	}

	public Persona findByIdentificacionPersona(String identificacion) {
		return repo.findByIdentificacion(identificacion);
	}

	public Persona savePersona(Persona persona) {
		return repo.save(persona);
	}

	public void deleteByIdPersona(long idpersona) {
		repo.deleteById(idpersona);
	}

}
