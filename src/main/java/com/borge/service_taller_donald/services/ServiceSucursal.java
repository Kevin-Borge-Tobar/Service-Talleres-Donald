package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Sucursal;
import com.borge.service_taller_donald.repositories.SucursalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceSucursal implements  IServiceSucursal {
private SucursalRepository sucursalRepository;


  @Override
  public List<Sucursal> findAll() {
    return sucursalRepository.findAll();
  }

  @Override
  public Sucursal findById(Integer id) {
    return sucursalRepository.findById(id).orElse(null);
  }

  @Override
  public Sucursal create(Sucursal sucursal) {
    return sucursalRepository.save(sucursal);
  }

  @Override
  public Sucursal updated(Sucursal sucursal, Integer id) {
    return sucursalRepository.save(sucursal) ;
  }

  @Override
  public void deleteById(Integer id) {
    sucursalRepository.deleteById(id);

  }
}
