package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Cotizacion;

import java.util.List;

public interface IServiceCotizacion {
  public List<Cotizacion> findAll();
  public Cotizacion findById(Integer id);
  public Cotizacion create(Cotizacion cotizacion);
  public Cotizacion updated(Cotizacion cotizacion, Integer id);
  public void  deleteById(Integer id );
}
