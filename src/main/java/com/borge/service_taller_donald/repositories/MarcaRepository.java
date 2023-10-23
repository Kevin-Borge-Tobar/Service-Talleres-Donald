package com.borge.service_taller_donald.repositories;

import com.borge.service_taller_donald.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
