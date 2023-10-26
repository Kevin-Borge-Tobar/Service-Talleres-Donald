package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetalleCotizacion;
import com.borge.service_taller_donald.entities.DetalleMaterial;
import com.borge.service_taller_donald.repositories.DetalleMaterialRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDetalleMaterial implements IServiceDetalleMaterial{
    private DetalleMaterialRepository detalleMaterialRepository;

    @Transactional(readOnly = true)
    @Override
    public List<DetalleMaterial> findAll() {
        return detalleMaterialRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleMaterial findById(Integer id) {
        return detalleMaterialRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DetalleMaterial create(DetalleMaterial detalleMaterial) {
        return detalleMaterialRepository.save(detalleMaterial);
    }

    @Override
    @Transactional
    public DetalleMaterial updated(DetalleMaterial detalleMaterial, Integer id) {
        return detalleMaterialRepository.save(detalleMaterial);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        detalleMaterialRepository.deleteById(id);
    }
}
