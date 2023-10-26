package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetalleMaterial;
import com.borge.service_taller_donald.entities.DetalleNomina;
import com.borge.service_taller_donald.entities.DetallePago;

import java.util.List;

public interface IServiceDetallePago {
    public List<DetallePago> findAll();

    public DetallePago findById(Integer id);

    public DetallePago create(DetallePago detallePago);

    public DetallePago updated(DetallePago detallePago, Integer id);

    public void deleteById(Integer id);
}
