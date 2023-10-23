package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.TipoDiagnostico;

import java.util.List;

public interface IServiceTipoDiagnostico {
  public List<TipoDiagnostico> findAll();
  public TipoDiagnostico findById(Integer id);
  public TipoDiagnostico create(TipoDiagnostico tipoDiagnostico);
  public TipoDiagnostico updated( TipoDiagnostico tipoDiagnostico, Integer id);
  public void  deleteById(Integer id );
}
