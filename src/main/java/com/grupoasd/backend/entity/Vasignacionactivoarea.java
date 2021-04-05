package com.grupoasd.backend.entity;

import javax.persistence.*;
import java.sql.*;

@Entity(name = "vasignacionactivoarea")
public class Vasignacionactivoarea {
	@Id
	private long id;
	private String tipoactivo;
	private String activo;
	private String area;
	private Date fechaasignacion;
	private String usuario;

	protected Vasignacionactivoarea() {

	}

	public Vasignacionactivoarea(long id, String tipoactivo, String activo, String area, Date fechaasignacion,
			String usuario) {
		super();
		this.id = id;
		this.tipoactivo = tipoactivo;
		this.activo = activo;
		this.area = area;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
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
