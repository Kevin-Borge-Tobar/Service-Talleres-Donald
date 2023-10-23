package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Automovil;

import java.util.List;

public interface IServiceAutomovil {
  public List<Automovil> findAll();
  public Automovil findById(Integer id);
  public Automovil create(Automovil automovil);
  public Automovil updated(Automovil automovil, Integer id);
  public void  deleteById(Integer id );
}
