package com.borge.service_taller_donald.repositories;

import com.borge.service_taller_donald.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
