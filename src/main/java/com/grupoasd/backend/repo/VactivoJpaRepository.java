package com.grupoasd.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupoasd.backend.entity.*;
import java.util.*;

public interface VactivoJpaRepository extends JpaRepository<Vactivo, Long> {
	
	List<Vactivo> findByTipoactivo(String tipoactivo);

	List<Vactivo> findByFechacompra(java.sql.Date fechacompra);

	List<Vactivo> findBySerial(String serial);
}
