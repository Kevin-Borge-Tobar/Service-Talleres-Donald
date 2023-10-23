package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Proveedor;
import java.util.List;

public interface IServiceProveedor {
  public List<Proveedor> findAll();
  public Proveedor findById(Integer id);
  public Proveedor create(Proveedor proveedor);
  public Proveedor updated(Proveedor proveedor, Integer id);
  public void  deleteById(Integer id );
}
