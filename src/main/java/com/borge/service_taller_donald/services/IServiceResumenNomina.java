package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.ResumenNomina;

import java.util.List;

public interface IServiceResumenNomina {
    public List<ResumenNomina> findAll();

    public ResumenNomina findById(Integer id);

    public ResumenNomina create(ResumenNomina resumenNomina);

    public ResumenNomina updated(ResumenNomina resumenNomina, Integer id);

    public void deleteById(Integer id);
}
