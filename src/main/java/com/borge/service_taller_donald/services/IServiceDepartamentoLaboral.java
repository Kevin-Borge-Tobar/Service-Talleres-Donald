package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DepatamentoLaboral;
import com.borge.service_taller_donald.entities.Empleado;
import com.borge.service_taller_donald.entities.SocioNegocio;

import java.util.List;

public interface IServiceDepartamentoLaboral {
  public List<DepatamentoLaboral> findAll();
  public DepatamentoLaboral findById(Integer id);
  public DepatamentoLaboral create(DepatamentoLaboral depatamentoLaboral);
  public DepatamentoLaboral updated(DepatamentoLaboral depatamentoLaboral, Integer id);
  public void  deleteById(Integer id );
}
