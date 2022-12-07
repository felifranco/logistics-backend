package com.logistics.backend.entity;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente", unique = true, nullable = false)
	private int id_cliente;
	private String nombre;
	
	public Cliente() {
		super();
	}

	public Cliente(int id_cliente, String nombre) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
