package com.borge.service_taller_donald.services;
import com.borge.service_taller_donald.entities.Asistencia;
import com.borge.service_taller_donald.entities.Bodega;
import com.borge.service_taller_donald.repositories.AsistenciaRepository;
import com.borge.service_taller_donald.repositories.BodegaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceBodega implements IServiceBodega{
    private BodegaRepository bodegaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Bodega> findAll() {
        return bodegaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Bodega findById(Integer id) {
        return bodegaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Bodega create(Bodega bodega) {
        return bodegaRepository.save(bodega);
    }

    @Override
    @Transactional
    public Bodega updated(Bodega bodega, Integer id) {
        return bodegaRepository.save(bodega);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        bodegaRepository.deleteById(id);
    }
}
