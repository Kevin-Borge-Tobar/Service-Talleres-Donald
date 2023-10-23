package com.borge.service_taller_donald.repositories;

import com.borge.service_taller_donald.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
