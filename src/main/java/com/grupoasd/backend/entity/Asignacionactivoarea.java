package com.grupoasd.backend.entity;

import javax.persistence.*;
import java.sql.*;

@Entity
public class Asignacionactivoarea {
	@Id
	@GeneratedValue
	private long idasignacionactivo;
	private long idactivo;
	private long idarea;
	private Date fechaasignacion;
	private long idusuario;

	protected Asignacionactivoarea() {

	}

	public Asignacionactivoarea(long idasignacionactivo, long idactivo, long idarea, Date fechaasignacion,
			long idusuario) {
		super();
		this.idasignacionactivo = idasignacionactivo;
		this.idactivo = idactivo;
		this.idarea = idarea;
		this.fechaasignacion = fechaasignacion;
		this.idusuario = idusuario;
	}

	public long getIdasignacionactivo() {
		return idasignacionactivo;
	}

	public void setIdasignacionactivo(long idasignacionactivo) {
		this.idasignacionactivo = idasignacionactivo;
	}

	public long getIdactivo() {
		return idactivo;
	}

	public void setIdactivo(long idactivo) {
		this.idactivo = idactivo;
	}

	public long getIdarea() {
		return idarea;
	}

	public void setIdarea(long idarea) {
		this.idarea = idarea;
	}

	public Date getFechaasignacion() {
		return fechaasignacion;
	}

	public void setFechaasignacion(Date fechaasignacion) {
		this.fechaasignacion = fechaasignacion;
	}

	public long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(long idusuario) {
		this.idusuario = idusuario;
	}

}
