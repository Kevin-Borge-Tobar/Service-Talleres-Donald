package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DireccionSocioNegocio;

import java.util.List;

public interface IServiceDireccionSocioNegocio {
    public List<DireccionSocioNegocio> findAll();

    public DireccionSocioNegocio findById(Integer id);

    public DireccionSocioNegocio create(DireccionSocioNegocio direccionSocioNegocio);

    public DireccionSocioNegocio updated(DireccionSocioNegocio direccionSocioNegocio, Integer id);

    public void deleteById(Integer id);
}
