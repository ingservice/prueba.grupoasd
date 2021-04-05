package com.grupoasd.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupoasd.backend.entity.*;

public interface PaisJpaRepository extends JpaRepository<Pais, Long> {
	Pais findByPais(String pais);

	Pais findByCodigoiso(int codigoiso);
}
