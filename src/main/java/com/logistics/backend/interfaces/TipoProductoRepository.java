package com.logistics.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.backend.entity.TipoProducto;

public interface TipoProductoRepository extends JpaRepository<TipoProducto, Integer> {

}
