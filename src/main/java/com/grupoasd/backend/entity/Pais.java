package com.grupoasd.backend.entity;

import javax.persistence.*;

@Entity
public class Pais {
	@Id
	@GeneratedValue
	private long idpais;
	private String pais;
	private int codigoiso;

	protected Pais() {

	}

	public Pais(long idpais, String pais, int codigoiso) {
		super();
		this.idpais = idpais;
		this.pais = pais;
		this.codigoiso = codigoiso;
	}

	public long getIdpais() {
		return idpais;
	}

	public void setIdpais(long idpais) {
		this.idpais = idpais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getCodigoiso() {
		return codigoiso;
	}

	public void setCodigoiso(int codigoiso) {
		this.codigoiso = codigoiso;
	}

}
