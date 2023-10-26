package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Asistencia;
import com.borge.service_taller_donald.entities.Automovil;
import com.borge.service_taller_donald.repositories.AsistenciaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceAsistencia implements IServiceAsistencia{
    private AsistenciaRepository asistenciaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Asistencia> findAll() {
        return asistenciaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Asistencia findById(Integer id) {
        return asistenciaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Asistencia create(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    @Transactional
    public Asistencia updated(Asistencia asistencia, Integer id) {
        return asistenciaRepository.save(asistencia);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        asistenciaRepository.deleteById(id);
    }
}


