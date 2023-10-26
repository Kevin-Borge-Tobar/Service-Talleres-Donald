package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Mano_Obra;
import com.borge.service_taller_donald.entities.MovimientoMaterial;
import com.borge.service_taller_donald.repositories.MovimientoMaterialRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceMovimientoMaterial implements IServiceMovimientoMaterial{
    MovimientoMaterialRepository movimientoMaterialRepository;

    @Transactional(readOnly = true)
    @Override
    public List<MovimientoMaterial> findAll() {
        return movimientoMaterialRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public MovimientoMaterial findById(Integer id) {
        return movimientoMaterialRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public MovimientoMaterial create(MovimientoMaterial movimientoMaterial) {
        return movimientoMaterialRepository.save(movimientoMaterial);
    }

    @Override
    @Transactional
    public MovimientoMaterial updated(MovimientoMaterial movimientoMaterial, Integer id) {
        return movimientoMaterialRepository.save(movimientoMaterial);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        movimientoMaterialRepository.deleteById(id);
    }
}
