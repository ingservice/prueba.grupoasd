package com.grupoasd.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupoasd.backend.entity.*;
import java.util.*;

public interface DepartamentoJpaRepository extends JpaRepository<Departamento, Long> {
	
	Departamento findByDepartamento(String Departamento);

	List<Departamento> findByIdpais(long idpais);
	
	Departamento findByCodigodane(String codigodane);
}
