package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Diagnostico;

import java.util.List;

public interface IServiceDiagnostico {
  public List<Diagnostico> findAll();
  public Diagnostico findById(Integer id);
  public Diagnostico create(Diagnostico diagnostico);
  public Diagnostico updated( Diagnostico diagnostico, Integer id);
  public void  deleteById(Integer id );
}
