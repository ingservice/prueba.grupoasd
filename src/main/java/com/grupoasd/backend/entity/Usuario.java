package com.grupoasd.backend.entity;

import javax.persistence.*;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
	private long idusuario;
	private String usuario;
	private String clave;
	private String correo;

	protected Usuario() {

	}

	public Usuario(long idusuario, String usuario, String clave, String correo) {
		super();
		this.idusuario = idusuario;
		this.usuario = usuario;
		this.clave = clave;
		this.correo = correo;
	}

	public long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(long idusuario) {
		this.idusuario = idusuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
