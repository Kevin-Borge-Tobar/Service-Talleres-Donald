package com.borge.service_taller_donald.repositories;

import com.borge.service_taller_donald.entities.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutomovilRepository extends JpaRepository<Automovil, Integer> {
}
