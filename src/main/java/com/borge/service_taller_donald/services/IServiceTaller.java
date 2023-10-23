package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Empleado;
import com.borge.service_taller_donald.entities.Taller;

import java.util.List;

public interface IServiceTaller {
  public List<Taller> findAll();
  public Taller findById(Integer id);
  public Taller create(Taller taller);
  public Taller updated(Taller taller, Integer id);
  public void  deleteById(Integer id );
}
