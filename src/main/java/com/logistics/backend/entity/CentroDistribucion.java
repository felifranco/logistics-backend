package com.logistics.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="centro_distribucion")
public class CentroDistribucion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_centro_distribucion", unique = true, nullable = false)
	private int id_centro_distribucion;
	private String nombre_centro;
	private int id_tipo_centro_distribucion;
	private String ubicacion;
	
	public CentroDistribucion() {
		super();
	}

	public CentroDistribucion(int id_centro_distribucion, String nombre_centro, int id_tipo_centro_distribucion,
			String ubicacion) {
		super();
		this.id_centro_distribucion = id_centro_distribucion;
		this.nombre_centro = nombre_centro;
		this.id_tipo_centro_distribucion = id_tipo_centro_distribucion;
		this.ubicacion = ubicacion;
	}

	public int getId_centro_distribucion() {
		return id_centro_distribucion;
	}

	public void setId_centro_distribucion(int id_centro_distribucion) {
		this.id_centro_distribucion = id_centro_distribucion;
	}

	public String getNombre_centro() {
		return nombre_centro;
	}

	public void setNombre_centro(String nombre_centro) {
		this.nombre_centro = nombre_centro;
	}

	public int getId_tipo_centro_distribucion() {
		return id_tipo_centro_distribucion;
	}

	public void setId_tipo_centro_distribucion(int id_tipo_centro_distribucion) {
		this.id_tipo_centro_distribucion = id_tipo_centro_distribucion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}

