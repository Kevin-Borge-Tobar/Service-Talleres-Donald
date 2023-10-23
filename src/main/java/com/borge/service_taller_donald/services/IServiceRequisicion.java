package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Requisicion;

import java.util.List;

public interface IServiceRequisicion {
  public List<Requisicion> findAll();
  public Requisicion findById(Integer id);
  public Requisicion create(Requisicion requisicion);
  public Requisicion updated(Requisicion requisicion, Integer id);
  public void  deleteById(Integer id);
}
