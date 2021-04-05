package com.grupoasd.backend.entity;
import javax.persistence.*;

@Entity
public class Tipoactivo {
	@Id
	@GeneratedValue
	private long idtipoactivo;
	private String descripcion;

	protected Tipoactivo() {

	}

	public Tipoactivo(long idtipoactivo, String descripcion) {
		super();
		this.idtipoactivo = idtipoactivo;
		this.descripcion = descripcion;
	}

	public long getIdtipoactivo() {
		return idtipoactivo;
	}

	public void setIdtipoactivo(long idtipoactivo) {
		this.idtipoactivo = idtipoactivo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
