package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.entities.Pedido;
import com.borge.service_taller_donald.repositories.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicePedido implements IServicePedido{
    private PedidoRepository pedidoRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Pedido findById(Integer id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Pedido create(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    @Transactional
    public Pedido updated(Pedido pedido, Integer id) {
        return pedidoRepository.save(pedido);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        pedidoRepository.deleteById(id);
    }
}
