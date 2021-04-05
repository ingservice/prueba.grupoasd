package com.grupoasd.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupoasd.backend.entity.*;
import java.util.*;

public interface VasignacionactivoareaJpaRepository extends JpaRepository<Vasignacionactivoarea, Long> {
	List<Vasignacionactivoarea> findByArea(String area);

	List<Vasignacionactivoarea> findByUsuario(String usuario);

	List<Vasignacionactivoarea> findByFechaasignacion(java.sql.Date fechaasignacion);
}
