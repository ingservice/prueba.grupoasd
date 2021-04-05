package com.grupoasd.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupoasd.backend.entity.*;
import java.util.*;

public interface CiudadJpaRepository extends JpaRepository<Ciudad, Long> {
	Ciudad findByCiudad(String ciudad);

	Ciudad findByCodigodane(String codigoDane);

	List<Ciudad> findByIddepartamento(long iddepartamento);
}
