package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.TelefonoSucursal;

import java.util.List;

public interface IServiceTelefonoSucursal {
    public List<TelefonoSucursal> findAll();

    public TelefonoSucursal findById(Integer id);

    public TelefonoSucursal create(TelefonoSucursal telefonoSucursal);

    public TelefonoSucursal updated(TelefonoSucursal telefonoSucursal, Integer id);

    public void deleteById(Integer id);
}
