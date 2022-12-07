package com.logistics.backend.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="entrega")
public class Entrega {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_entrega", unique = true, nullable = false)
	private int id_entrega;
	private int id_tipo_producto;
	private int cantidad_producto;
	private Date fecha_registro;
	private Date fecha_entrega;
	private int id_centro_distribucion;
	private Number precio_envio;
	private int id_vehiculo;
	private String numero_guia;
	private int id_cliente;
	
	public Entrega() {
		super();
	}

	public Entrega(int id_entrega, int id_tipo_producto, int cantidad_producto, Date fecha_registro, Date fecha_entrega,
			int id_centro_distribucion, Number precio_envio, int id_vehiculo, String numero_guia, int id_cliente) {
		super();
		this.id_entrega = id_entrega;
		this.id_tipo_producto = id_tipo_producto;
		this.cantidad_producto = cantidad_producto;
		this.fecha_registro = fecha_registro;
		this.fecha_entrega = fecha_entrega;
		this.id_centro_distribucion = id_centro_distribucion;
		this.precio_envio = precio_envio;
		this.id_vehiculo = id_vehiculo;
		this.numero_guia = numero_guia;
		this.id_cliente = id_cliente;
	}

	public int getId_entrega() {
		return id_entrega;
	}

	public void setId_entrega(int id_entrega) {
		this.id_entrega = id_entrega;
	}

	public int getId_tipo_producto() {
		return id_tipo_producto;
	}

	public void setId_tipo_producto(int id_tipo_producto) {
		this.id_tipo_producto = id_tipo_producto;
	}

	public int getCantidad_producto() {
		return cantidad_producto;
	}

	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public int getId_centro_distribucion() {
		return id_centro_distribucion;
	}

	public void setId_centro_distribucion(int id_centro_distribucion) {
		this.id_centro_distribucion = id_centro_distribucion;
	}

	public Number getPrecio_envio() {
		return precio_envio;
	}

	public void setPrecio_envio(Number precio_envio) {
		this.precio_envio = precio_envio;
	}

	public int getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}

	public String getNumero_guia() {
		return numero_guia;
	}

	public void setNumero_guia(String numero_guia) {
		this.numero_guia = numero_guia;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
}
