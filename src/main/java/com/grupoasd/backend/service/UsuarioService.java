package com.grupoasd.backend.service;

import com.grupoasd.backend.entity.*;
import com.grupoasd.backend.repo.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioJpaRepository repo;

	public List<Usuario> findAllUsuario() {
		return repo.findAll();
	}

	public Usuario saveUsuario(Usuario usuario) {
		return repo.save(usuario);
	}

	public Optional<Usuario> findByIdUsuario(long idusuario) {
		return repo.findById(idusuario);
	}

	public Usuario findByUsuarioAndClaveLogin(String user, String pass) {
		return repo.findByUsuarioAndClave(user, pass);
	}

}
