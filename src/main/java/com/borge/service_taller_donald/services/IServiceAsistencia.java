package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Asistencia;

import java.util.List;

public interface IServiceAsistencia {
    public List<Asistencia> findAll();

    public Asistencia findById(Integer id);

    public Asistencia create(Asistencia asistencia);

    public Asistencia updated(Asistencia asistencia, Integer id);

    public void deleteById(Integer id);

}
