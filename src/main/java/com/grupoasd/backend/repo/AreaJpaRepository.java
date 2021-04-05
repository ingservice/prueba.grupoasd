package com.grupoasd.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupoasd.backend.entity.*;
import java.util.*;

public interface AreaJpaRepository extends JpaRepository<Area, Long> {
	Area findByArea(String area);
	
	Area findByIdarea(long idarea);

	List<Area> findByIdciudad(long idciudad);
}
