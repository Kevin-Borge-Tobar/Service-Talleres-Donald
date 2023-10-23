package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Municipio;
import java.util.List;
import java.util.Optional;

public interface IServiceMunicipio {
  public List<Municipio> findAll();
  public Optional<Municipio> findById(Integer id);
  public void  create(Municipio municipio, Integer id);
  public  void updated(Municipio municipio, Integer id);
  public void deleteById(Integer id);


}
