package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.TipoMovimientoNomina;

import java.util.List;

public interface IServiceTipoMovimientoNomina {
    public List<TipoMovimientoNomina> findAll();

    public TipoMovimientoNomina findById(Integer id);

    public TipoMovimientoNomina create(TipoMovimientoNomina tipoMovimientoNomina);

    public TipoMovimientoNomina updated(TipoMovimientoNomina tipoMovimientoNomina, Integer id);

    public void deleteById(Integer id);
}
