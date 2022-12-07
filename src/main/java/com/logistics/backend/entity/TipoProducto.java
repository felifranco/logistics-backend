package com.logistics.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_producto")
public class TipoProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_producto", unique = true, nullable = false)
	private int id_tipo_producto;
	private String nombre;
	private String descripcion;
	
	public TipoProducto() {
		super();
	}

	public TipoProducto(int id_tipo_producto, String nombre, String descripcion) {
		super();
		this.id_tipo_producto = id_tipo_producto;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getId_tipo_producto() {
		return id_tipo_producto;
	}

	public void setId_tipo_producto(int id_tipo_producto) {
		this.id_tipo_producto = id_tipo_producto;
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
