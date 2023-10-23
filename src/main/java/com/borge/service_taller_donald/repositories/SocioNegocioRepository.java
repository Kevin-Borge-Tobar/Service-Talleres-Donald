package com.borge.service_taller_donald.repositories;

import com.borge.service_taller_donald.entities.SocioNegocio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SocioNegocioRepository extends JpaRepository<SocioNegocio, Integer> {
  Optional<SocioNegocio> findByNit(String nit);

}
