package com.logistics.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_centro_distribucion")
public class TipoCentroDistribucion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_centro_distribucion", unique = true, nullable = false)
	private int id_tipo_centro_distribucion;
	private String nombre;
	private String descripcion;
	
	public TipoCentroDistribucion() {
		super();
	}

	public TipoCentroDistribucion(int id_tipo_centro_distribucion, String nombre, String descripcion) {
		super();
		this.id_tipo_centro_distribucion = id_tipo_centro_distribucion;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getId_tipo_centro_distribucion() {
		return id_tipo_centro_distribucion;
	}

	public void setId_tipo_centro_distribucion(int id_tipo_centro_distribucion) {
		this.id_tipo_centro_distribucion = id_tipo_centro_distribucion;
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
}

