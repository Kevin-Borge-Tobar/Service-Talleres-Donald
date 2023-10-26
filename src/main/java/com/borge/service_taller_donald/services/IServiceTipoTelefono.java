package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.TipoTelefono;

import java.util.List;

public interface IServiceTipoTelefono {
    public List<TipoTelefono> findAll();

    public TipoTelefono findById(Integer id);

    public TipoTelefono create(TipoTelefono tipoTelefono);

    public TipoTelefono updated(TipoTelefono tipoTelefono, Integer id);

    public void deleteById(Integer id);
}
