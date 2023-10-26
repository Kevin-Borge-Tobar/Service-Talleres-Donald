package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetallePago;
import com.borge.service_taller_donald.entities.DetallePedio;
import com.borge.service_taller_donald.repositories.DetallePedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDetallePedido implements IServiceDetallePedido{
    DetallePedidoRepository detallePedidoRepository;

    @Transactional(readOnly = true)
    @Override
    public List<DetallePedido> findAll() {
        return detallePedidoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DetallePedido findById(Integer id) {
        return detallePedidoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DetallePedido create(DetallePedido detallePedido) {
        return detallePedidoRepository.save(detallePedido);
    }

    @Override
    @Transactional
    public DetallePedido updated(DetallePedido detallePedido, Integer id) {
        return detallePedidoRepository.save(detallePedido);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        detallePedidoRepository.deleteById(id);
    }
}
