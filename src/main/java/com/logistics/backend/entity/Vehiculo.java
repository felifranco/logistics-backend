package com.logistics.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vehiculo", unique = true, nullable = false)
	private int id_vehiculo;
	private String registro;
	private int id_tipo_vehiculo;
	
	public Vehiculo() {
		super();
	}

	public Vehiculo(int id_vehiculo, String registro, int id_tipo_vehiculo) {
		super();
		this.id_vehiculo = id_vehiculo;
		this.registro = registro;
		this.id_tipo_vehiculo = id_tipo_vehiculo;
	}

	public int getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public int getId_tipo_vehiculo() {
		return id_tipo_vehiculo;
	}

	public void setId_tipo_vehiculo(int id_tipo_vehiculo) {
		this.id_tipo_vehiculo = id_tipo_vehiculo;
	}
}
