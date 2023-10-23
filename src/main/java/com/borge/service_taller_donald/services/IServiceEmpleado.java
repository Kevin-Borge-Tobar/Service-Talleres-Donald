package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Empleado;
import com.borge.service_taller_donald.entities.SocioNegocio;

import java.util.List;

public interface IServiceEmpleado {
  public List<Empleado> findAll();
  public Empleado findById(Integer id);
  public Empleado create(Empleado empleado);
  public Empleado updated(Empleado empleado, Integer id);
  public void  deleteById(Integer id );
}
