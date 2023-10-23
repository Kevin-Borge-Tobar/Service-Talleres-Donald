package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.ContratoLaboral;


import java.util.List;

public interface IServiceContratoLaboral {
  public List<ContratoLaboral> findAll();
  public ContratoLaboral findById(Integer id);
  public ContratoLaboral create(ContratoLaboral contratoLaboral);
  public ContratoLaboral updated(ContratoLaboral contratoLaboral, Integer id);
  public void  deleteById(Integer id );
}
