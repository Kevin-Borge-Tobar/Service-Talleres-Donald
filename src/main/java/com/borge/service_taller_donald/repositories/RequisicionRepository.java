package com.borge.service_taller_donald.repositories;

import com.borge.service_taller_donald.entities.Requisicion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequisicionRepository extends JpaRepository<Requisicion, Integer> {
}
