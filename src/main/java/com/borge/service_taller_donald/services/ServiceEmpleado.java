package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Empleado;
import com.borge.service_taller_donald.repositories.EmpleadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceEmpleado  implements  IServiceEmpleado{
  private EmpleadoRepository empleadoRepository;

  @Override
@Transactional(readOnly = true)
  public List<Empleado> findAll() {
    return  empleadoRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Empleado findById(Integer id) {
    return empleadoRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Empleado create(Empleado empleado) {
    return empleadoRepository.save(empleado);
  }

  @Override
  @Transactional
  public Empleado updated(Empleado empleado, Integer id) {
    return empleadoRepository.save(empleado);
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
    empleadoRepository.deleteById(id);

  }
}
