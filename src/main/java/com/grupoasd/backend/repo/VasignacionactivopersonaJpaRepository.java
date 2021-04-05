package com.grupoasd.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupoasd.backend.entity.*;
import java.util.*;

public interface VasignacionactivopersonaJpaRepository extends JpaRepository<Vasignacionactivopersona, Long> {
	List<Vasignacionactivopersona> findByPersona(String persona);

	List<Vasignacionactivopersona> findByUsuario(String usuario);

	List<Vasignacionactivopersona> findByFechaasignacion(java.sql.Date fechaasignacion);
}
