package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.TipoAsistencia;
import com.borge.service_taller_donald.entities.TipoMovimiento;

import java.util.List;

public interface IServiceTipoMovimiento {
    public List<TipoMovimiento> findAll();

    public TipoMovimiento findById(Integer id);

    public TipoMovimiento create(TipoMovimiento tipoMovimiento);

    public TipoMovimiento updated(TipoMovimiento tipoMovimiento, Integer Id);

    public void deleteById(Integer id);
}
