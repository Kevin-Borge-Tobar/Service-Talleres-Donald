package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Asistencia;
import com.borge.service_taller_donald.entities.Bodega;

import java.util.List;

public interface IServiceBodega{
    public List<Bodega> findAll();

    public Bodega findById(Integer id);

    public Bodega create(Bodega bodega);

    public Bodega updated(Bodega bodega, Integer id);

    public void deleteById(Integer id);
}
