package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Cita;

import java.util.List;

public interface IServiceCita {
  public List<Cita> findAll();
  public Cita findById(Integer id);
  public Cita create(Cita cita);
  public Cita updated( Cita cita, Integer id);
  public void  deleteById(Integer id );
}
