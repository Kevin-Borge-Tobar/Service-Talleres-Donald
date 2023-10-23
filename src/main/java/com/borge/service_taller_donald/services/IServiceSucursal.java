package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Sucursal;

import java.util.List;

public interface IServiceSucursal {
  public List<Sucursal> findAll();
  public Sucursal findById(Integer id);
  public Sucursal create(Sucursal sucursal);
  public Sucursal updated( Sucursal sucursal, Integer id);
  public void  deleteById(Integer id );
}
