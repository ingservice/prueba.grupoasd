package com.grupoasd.backend.entity;

import javax.persistence.*;
import java.sql.*;

@Entity(name = "vactivodisponible")
public class Vactivodisponible {
	@Id	
	private long idactivo;
	private String nombre;
	private String descripcion;
	private long idtipoactivo;
	private String serial;
	private String numerointerno;
	private double peso;
	private double alto;
	private double ancho;
	private double largo;
	private double valorcompra;
	private Date fechacompra;

	protected Vactivodisponible() {
	}

	public Vactivodisponible(long idactivo, String nombre, String descripcion, long idtipoactivo, String serial,
			String numerointerno, double peso, double alto, double ancho, double largo, double valorcompra,
			Date fechacompra) {
		super();
		this.idactivo = idactivo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.idtipoactivo = idtipoactivo;
		this.serial = serial;
		this.numerointerno = numerointerno;
		this.peso = peso;
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
		this.valorcompra = valorcompra;
		this.fechacompra = fechacompra;
	}

	public long getIdactivo() {
		return idactivo;
	}

	public void setIdactivo(long idactivo) {
		this.idactivo = idactivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public long getIdtipoactivo() {
		return idtipoactivo;
	}

	public void setIdtipoactivo(long idtipoactivo) {
		this.idtipoactivo = idtipoactivo;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getNumerointerno() {
		return numerointerno;
	}

	public void setNumerointerno(String numerointerno) {
		this.numerointerno = numerointerno;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getValorcompra() {
		return valorcompra;
	}

	public void setValorcompra(double valorcompra) {
		this.valorcompra = valorcompra;
	}

	public Date getFechacompra() {
		return fechacompra;
	}

	public void setFechacompra(Date fechacompra) {
		this.fechacompra = fechacompra;
	}

}
