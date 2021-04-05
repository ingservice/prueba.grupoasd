package com.grupoasd.backend.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity(name = "vasignacionactivopersona")
public class Vasignacionactivopersona {
	@Id
	private long id;
	private String tipoactivo;
	private String activo;
	private String persona;
	private Date fechaasignacion;
	private String usuario;

	protected Vasignacionactivopersona() {

	}

	public Vasignacionactivopersona(long id, String tipoactivo, String activo, String persona, Date fechaasignacion,
			String usuario) {
		super();
		this.id = id;
		this.tipoactivo = tipoactivo;
		this.activo = activo;
		this.persona = persona;
		this.fechaasignacion = fechaasignacion;
		this.usuario = usuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipoactivo() {
		return tipoactivo;
	}

	public void setTipoactivo(String tipoactivo) {
		this.tipoactivo = tipoactivo;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public Date getFechaasignacion() {
		return fechaasignacion;
	}

	public void setFechaasignacion(Date fechaasignacion) {
		this.fechaasignacion = fechaasignacion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
