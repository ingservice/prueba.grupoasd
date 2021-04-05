package com.grupoasd.backend.entity;

import javax.persistence.*;

@Entity
public class Departamento {
	@Id
	@GeneratedValue
	private long iddepartamento;
	private String departamento;
	private String codigodane;
	private long idpais;

	protected Departamento() {

	}

	public Departamento(long iddepartamento, String departamento, String codigodane, long idpais) {
		super();
		this.iddepartamento = iddepartamento;
		this.departamento = departamento;
		this.codigodane = codigodane;
		this.idpais = idpais;
	}

	public long getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(long iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCodigodane() {
		return codigodane;
	}

	public void setCodigodane(String codigodane) {
		this.codigodane = codigodane;
	}

	public long getIdpais() {
		return idpais;
	}

	public void setIdpais(long idpais) {
		this.idpais = idpais;
	}

}
