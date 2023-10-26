package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DireccionSocioNegocio;
import com.borge.service_taller_donald.entities.DireccionSucursal;

import java.util.List;

public interface IServiceDireccionSucursal {
    public List<DireccionSucursal> findAll();

    public DireccionSucursal findById(Integer id);

    public DireccionSucursal create(DireccionSucursal direccionSucursal);

    public DireccionSucursal updated(DireccionSucursal direccionSucursal, Integer id);

    public void deleteById(Integer id);
}
