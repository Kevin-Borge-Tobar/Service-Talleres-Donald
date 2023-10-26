package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.TipoDireccion;

import java.util.List;

public interface IServiceTipoDireccion {
    public List<TipoDireccion> findAll();

    public TipoDireccion findById(Integer id);

    public TipoDireccion create(TipoDireccion tipoDireccion);

    public TipoDireccion updated(TipoDireccion tipoDireccion, Integer id);

    public void deleteById(Integer id);
}
