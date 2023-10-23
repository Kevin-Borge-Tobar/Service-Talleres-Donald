package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetalleManoObra;

import java.util.List;

public interface IServiceDetalleManoObra {
  public List<DetalleManoObra> findAll();
  public DetalleManoObra findById(Integer id);
  public DetalleManoObra create(DetalleManoObra detalleManoObra);
  public DetalleManoObra updated( DetalleManoObra detalleManoObra, Integer id);
  public void  deleteById(Integer id );
}
