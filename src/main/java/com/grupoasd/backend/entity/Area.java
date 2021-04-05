package com.grupoasd.backend.entity;

import javax.persistence.*;

@Entity
public class Area {
	@Id
	@GeneratedValue
	private long idarea;
	private String area;
	private long idciudad;
	private String descripcion;

	protected Area() {

	}

	public Area(long idarea, String area, long idciudad, String descripcion) {
		super();
		this.idarea = idarea;
		this.area = area;
		this.idciudad = idciudad;
		this.descripcion = descripcion;
	}

	public long getIdarea() {
		return idarea;
	}

	public void setIdarea(long idarea) {
		this.idarea = idarea;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public long getIdciudad() {
		return idciudad;
	}

	public void setIdciudad(long idciudad) {
		this.idciudad = idciudad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
