package com.borge.service_taller_donald.repositories;

import com.borge.service_taller_donald.entities.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Integer> {
}
