package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Requisicion;
import com.borge.service_taller_donald.repositories.RequisicionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceRequisicion  implements  IServiceRequisicion{
  private RequisicionRepository requisicionRepository;

  @Override
  @Transactional(readOnly = true)
  public List<Requisicion> findAll() {
    return requisicionRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Requisicion findById(Integer id) {
    return requisicionRepository.findById(id).orElse(null);
  }


  @Override
  @Transactional
  public Requisicion create(Requisicion requisicion) {
    return requisicionRepository.save(requisicion);
  }

  @Override
  @Transactional
  public Requisicion updated(Requisicion requisicion, Integer id) {
    return requisicionRepository.save(requisicion);
  }

  @Override
  public void deleteById(Integer id) {
  requisicionRepository.deleteById(id);
  }
}
