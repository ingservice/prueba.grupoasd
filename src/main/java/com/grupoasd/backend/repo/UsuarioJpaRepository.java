package com.grupoasd.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupoasd.backend.entity.*;

public interface UsuarioJpaRepository extends JpaRepository<Usuario,Long> {
	Usuario findByUsuarioAndClave(String user, String pass);
}
