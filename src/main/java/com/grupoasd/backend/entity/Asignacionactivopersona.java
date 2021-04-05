package com.grupoasd.backend.entity;

import javax.persistence.*;
import java.sql.*;

@Entity
public class Asignacionactivopersona {
	@Id
	@GeneratedValue
	private long idasignacionactivopersona;
	private long idactivo;
	private long idpersona;
	private Date fechaasignacion;
	private long idusuario;

	protected Asignacionactivopersona() {

	}

	public Asignacionactivopersona(long idasignacionactivopersona, long idactivo, long idpersona, Date fechaasignacion,
			long idusuario) {
		super();
		this.idasignacionactivopersona = idasignacionactivopersona;
		this.idactivo = idactivo;
		this.idpersona = idpersona;
		this.fechaasignacion = fechaasignacion;
		this.idusuario = idusuario;
	}

	public long getIdasignacionactivopersona() {
		return idasignacionactivopersona;
	}

	public void setIdasignacionactivopersona(long idasignacionactivopersona) {
		this.idasignacionactivopersona = idasignacionactivopersona;
	}

	public long getIdactivo() {
		return idactivo;
	}

	public void setIdactivo(long idactivo) {
		this.idactivo = idactivo;
	}

	public long getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
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
