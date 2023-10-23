package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.ContratoLaboral;
import com.borge.service_taller_donald.entities.Empleado;
import com.borge.service_taller_donald.entities.PuestoLaboral;
import com.borge.service_taller_donald.entities.SocioNegocio;

import java.util.List;

public interface IServicePuestoLaboral {
  public List<PuestoLaboral> findAll();
  public PuestoLaboral findByid(Integer id);
  public PuestoLaboral create(PuestoLaboral puestoLaboral);
  public PuestoLaboral updated(PuestoLaboral puestoLaboral, Integer id);
  public void  deleteById(Integer id );
}

