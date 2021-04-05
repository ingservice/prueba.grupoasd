package com.grupoasd.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupoasd.backend.entity.*;
import java.util.*;

public interface PersonaJpaRepository extends JpaRepository<Persona, Long> {
	Persona findByIdentificacion(String identificacion);

	List<Persona> findByApellido(String apellido);

	List<Persona> findByNombre(String nombre);

	List<Persona> findByIdarea(long idarea);
}
