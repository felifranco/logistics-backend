package com.logistics.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_vehiculo")
public class TipoVehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_vehiculo", unique = true, nullable = false)
	private int id_tipo_vehiculo;
	private String nombre;
	private String descripcion;
	
	public TipoVehiculo() {
		super();
	}

	public TipoVehiculo(int id_tipo_vehiculo, String nombre, String descripcion) {
		super();
		this.id_tipo_vehiculo = id_tipo_vehiculo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getId_tipo_vehiculo() {
		return id_tipo_vehiculo;
	}

	public void setId_tipo_vehiculo(int id_tipo_vehiculo) {
		this.id_tipo_vehiculo = id_tipo_vehiculo;
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
