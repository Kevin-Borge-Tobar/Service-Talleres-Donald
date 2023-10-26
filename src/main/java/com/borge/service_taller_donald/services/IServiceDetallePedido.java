package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetallePedido;

import java.util.List;

public interface IServiceDetallePedido {
    public List<DetallePedido> findAll();

    public DetallePedido findById(Integer id);

    public DetallePedido create(DetallePedido detallePedio);

    public DetallePedido updated(DetallePedido detallePedido, Integer id);

    public void deleteById(Integer id);
}
