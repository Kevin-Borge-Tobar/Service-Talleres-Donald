package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Departamento;

import java.util.List;
import java.util.Optional;

public interface IServiceDepartamento  {
  public List<Departamento> findAll();
  public Optional<Departamento> findById(Integer id);
  public Departamento create(Departamento departamento, Integer id);
  public Integer update (Integer id, Departamento departamento);
  public void deleteById(Integer id);


}
