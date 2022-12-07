package com.logistics.backend.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistics.backend.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
