package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Empleado;
import com.borge.service_taller_donald.entities.Marca;

import java.util.List;

public interface IServiceMarca {
  public List<Marca> findAll();
  public Marca findById(Integer id);
  public Marca create(Marca marca);
  public Marca updated(Marca marca, Integer id);
  public void  deleteById(Integer id );
}
