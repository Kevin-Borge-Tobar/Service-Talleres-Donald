package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.OrdenTrabajo;

import java.util.List;

public interface IServiceOrdenTrabajo {
    public List<OrdenTrabajo> findAll();

    public OrdenTrabajo findById(Integer id);

    public OrdenTrabajo create(OrdenTrabajo ordenTrabajo);

    public OrdenTrabajo updated(OrdenTrabajo ordenTrabajo, Integer id);

    public void deleteById(Integer id);
}
