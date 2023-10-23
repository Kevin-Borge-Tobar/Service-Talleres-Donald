package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Material;
import com.borge.service_taller_donald.repositories.MaterialRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceMaterial  implements  IServiceMaterial{
  private MaterialRepository materialRepository;
  @Override
  @Transactional(readOnly = true)
  public List<Material> findAll() {
    return  materialRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Material findById(Integer id) {
    return materialRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public Material create(Material material) {
    return materialRepository.save(material);
  }

  @Override
  @Transactional
  public Material updated(Material material, Integer id) {
    return materialRepository.save(material);
  }

  @Override
  @Transactional
  public void deleteById(Integer id) {
  materialRepository.deleteById(id);
  }
}
