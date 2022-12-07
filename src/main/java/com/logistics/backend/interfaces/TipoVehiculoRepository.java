package com.logistics.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.backend.entity.TipoVehiculo;

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer> {

}
