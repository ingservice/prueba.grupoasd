package com.grupoasd.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupoasd.backend.entity.*;

public interface ActivoJpaRepository extends JpaRepository<Activo, Long> {	
	
}
