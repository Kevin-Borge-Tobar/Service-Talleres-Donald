package com.borge.service_taller_donald.repositories;

import com.borge.service_taller_donald.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
