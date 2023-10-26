package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetalleCotizacion;

import java.util.List;

public interface IServiceDetalleCotizacion {
    public List<DetalleCotizacion> findAll();

    public DetalleCotizacion findById(Integer id);

    public DetalleCotizacion create(DetalleCotizacion detalleCotizacion);

    public DetalleCotizacion updated(DetalleCotizacion detalleCotizacion, Integer id);

    public void deleteById(Integer id);
}
