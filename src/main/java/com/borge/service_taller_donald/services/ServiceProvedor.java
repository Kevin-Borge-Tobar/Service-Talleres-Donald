package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Proveedor;
import com.borge.service_taller_donald.repositories.ProveedorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceProvedor  implements  IServiceProveedor{
  private ProveedorRepository proveedorRepository;
  @Override
  @Transactional(readOnly = true)
  public List<Proveedor> findAll() {
    return proveedorRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Proveedor findById(Integer id) {
    return proveedorRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Proveedor create(Proveedor proveedor) {
    return proveedorRepository.save(proveedor);
  }

  @Override
  @Transactional
  public Proveedor updated(Proveedor proveedor, Integer id) {
    return proveedorRepository.save(proveedor);
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
  proveedorRepository.deleteById(id);
  }
}
