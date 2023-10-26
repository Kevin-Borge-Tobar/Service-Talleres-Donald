package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.MovimientoMaterial;

import java.util.List;

public interface IServiceMovimientoMaterial {
    public List<MovimientoMaterial> findAll();

    public MovimientoMaterial findById(Integer id);

    public MovimientoMaterial create(MovimientoMaterial movimientoMaterial);

    public MovimientoMaterial updated(MovimientoMaterial movimientoMaterial, Integer id);

    public void deleteById(Integer id);
}
