package com.grupoasd.backend.entity;

import javax.persistence.*;

@Entity
public class Persona {
	@Id
	@GeneratedValue
	private long idpersona;
	private String identificacion;
	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;
	private long idarea;

	protected Persona() {

	}

	public Persona(long idpersona, String identificacion, String nombre, String apellido, String correo,
			String telefono, long idarea) {
		super();
		this.idpersona = idpersona;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.idarea = idarea;
	}

	public long getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public long getIdarea() {
		return idarea;
	}

	public void setIdarea(long idarea) {
		this.idarea = idarea;
	}

}
