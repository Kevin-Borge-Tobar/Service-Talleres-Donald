package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.TipoPago;

import java.util.List;

public interface IServiceTipoPago {
    public List<TipoPago> findAll();

    public TipoPago findById(Integer id);

    public TipoPago create(TipoPago tipoPago);

    public TipoPago updated(TipoPago tipoPago, Integer id);

    public void deleteById(Integer id);
}
