package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetalleNomina;

import java.util.List;

public interface IServiceDetalleNomina {
    public List<DetalleNomina> findAll();

    public DetalleNomina findById(Integer id);

    public DetalleNomina create(DetalleNomina detalleNomina);

    public DetalleNomina updated(DetalleNomina detalleNomina, Integer id);

    public void deleteById(Integer id);
}
