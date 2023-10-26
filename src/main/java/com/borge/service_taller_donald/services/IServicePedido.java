package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Pedido;

import java.util.List;

public interface IServicePedido {
    public List<Pedido> findAll();

    public Pedido findById(Integer id);

    public Pedido create(Pedido pedido);

    public Pedido updated(Pedido pedido, Integer id);

    public void deleteById(Integer id);
}
