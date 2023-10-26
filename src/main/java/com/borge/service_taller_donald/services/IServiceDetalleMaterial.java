package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetalleMaterial;

import java.util.List;

public interface IServiceDetalleMaterial {
    public List<DetalleMaterial> findAll();

    public DetalleMaterial findById(Integer id);

    public DetalleMaterial create(DetalleMaterial detalleMaterial);

    public DetalleMaterial updated(DetalleMaterial detalleMaterial, Integer id);

    public void deleteById(Integer id);
}
