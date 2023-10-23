package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Linea;

import java.util.List;
public interface IServiceLinea {
  public List<Linea> findAll();
  public Linea findById(Integer id);
  public Linea create(Linea linea);
  public Linea updated( Linea linea, Integer id);
  public void  deleteById(Integer id );
}
