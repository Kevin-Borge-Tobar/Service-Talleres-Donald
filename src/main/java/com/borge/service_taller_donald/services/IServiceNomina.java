package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;

import java.util.List;

public interface IServiceNomina {
    public List<Nomina> findAll();

    public Nomina findById(Integer id);

    public Nomina create(Nomina nomina);

    public Nomina updated(Nomina nomina, Integer integer);

    public void deleteById(Integer id);
}
