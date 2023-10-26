package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetalleMaterial;
import com.borge.service_taller_donald.entities.DetalleMovimientoMaterial;
import com.borge.service_taller_donald.repositories.DetalleMovimientoMaterialRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDetalleMovimientoMaterial implements IServiceDetalleMovimientoMaterial{
    DetalleMovimientoMaterialRepository detalleMovimientoMaterialRepository;

    @Transactional(readOnly = true)
    @Override
    public List<DetalleMovimientoMaterial> findAll() {
        return detalleMovimientoMaterialRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleMovimientoMaterial findById(Integer id) {
        return detalleMovimientoMaterialRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DetalleMovimientoMaterial create(DetalleMovimientoMaterial detalleMovimientoMaterial) {
        return detalleMovimientoMaterialRepository.save(detalleMovimientoMaterial);
    }

    @Override
    @Transactional
    public DetalleMovimientoMaterial updated(DetalleMovimientoMaterial detalleMovimientoMaterial, Integer id) {
        return detalleMovimientoMaterialRepository.save(detalleMovimientoMaterial);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        detalleMovimientoMaterialRepository.deleteById(id);
    }
}
