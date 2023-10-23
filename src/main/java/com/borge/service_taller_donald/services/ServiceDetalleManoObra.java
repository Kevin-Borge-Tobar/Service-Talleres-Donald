package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetalleManoObra;
import com.borge.service_taller_donald.repositories.DetalleManoObraRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDetalleManoObra implements IServiceDetalleManoObra{
  private DetalleManoObraRepository detalleManoObraRepository;

  @Override
  public List<DetalleManoObra> findAll() {
    return detalleManoObraRepository.findAll();
  }

  @Override

  public DetalleManoObra findById(Integer id) {
    return detalleManoObraRepository.findById(id).orElse(null);
  }

  @Override
  public DetalleManoObra create(DetalleManoObra detalleManoObra) {
    return detalleManoObraRepository.save(detalleManoObra);
  }

  @Override
  public DetalleManoObra updated(DetalleManoObra detalleManoObra, Integer id) {
    return detalleManoObraRepository.save(detalleManoObra);
  }

  @Override
  public void deleteById(Integer id) {
    detalleManoObraRepository.findById(id);

  }
}
