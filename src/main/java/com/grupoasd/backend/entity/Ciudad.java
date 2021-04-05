package com.grupoasd.backend.entity;

import javax.persistence.*;

@Entity
public class Ciudad {
	@Id
	@GeneratedValue
	private long idciudad;
	private String ciudad;
	private long iddepartamento;
	private String codigodane;

	protected Ciudad() {

	}

	public long getIdciudad() {
		return idciudad;
	}

	public void setIdciudad(long idciudad) {
		this.idciudad = idciudad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public long getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(long iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getCodigodane() {
		return codigodane;
	}

	public void setCodigodane(String codigodane) {
		this.codigodane = codigodane;
	}

}
