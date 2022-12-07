package com.logistics.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.backend.entity.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {

}
