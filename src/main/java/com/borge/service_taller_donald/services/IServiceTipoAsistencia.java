package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.TipoAsistencia;

import java.util.List;

public interface IServiceTipoAsistencia {
    public List<TipoAsistencia> findAll();

    public TipoAsistencia findById(Integer id);

    public TipoAsistencia create(TipoAsistencia tipoAsistencia);

    public TipoAsistencia updated(TipoAsistencia tipoAsistencia, Integer id);

    public void deleteById(Integer id);
}
