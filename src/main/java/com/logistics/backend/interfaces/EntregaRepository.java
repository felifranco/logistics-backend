package com.logistics.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.backend.entity.Entrega;

public interface EntregaRepository extends JpaRepository<Entrega, Integer> {

}
