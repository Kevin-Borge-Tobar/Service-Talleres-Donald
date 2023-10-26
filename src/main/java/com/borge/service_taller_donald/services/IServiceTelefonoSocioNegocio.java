package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.TelefonoSocioNegocio;

import java.util.List;

public interface IServiceTelefonoSocioNegocio {
    public List<TelefonoSocioNegocio> findAll();

    public TelefonoSocioNegocio findById(Integer id);

    public TelefonoSocioNegocio create(TelefonoSocioNegocio telefonoSocioNegocio);

    public TelefonoSocioNegocio updated(TelefonoSocioNegocio telefonoSocioNegocio, Integer id);

    public void deleteById(Integer id);
}
