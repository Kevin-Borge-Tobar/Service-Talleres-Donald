package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.entities.TipoAsistencia;
import com.borge.service_taller_donald.repositories.TipoAsistenciaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceTipoAsistencia implements IServiceTipoAsistencia{
    private TipoAsistenciaRepository tipoAsistenciaRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TipoAsistencia> findAll() {
        return tipoAsistenciaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoAsistencia findById(Integer id) {
        return tipoAsistenciaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TipoAsistencia create(TipoAsistencia tipoAsistencia) {
        return tipoAsistenciaRepository.save(tipoAsistencia);
    }

    @Override
    @Transactional
    public TipoAsistencia updated(TipoAsistencia tipoAsistencia, Integer id) {
        return tipoAsistenciaRepository.save(tipoAsistencia);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        tipoAsistenciaRepository.deleteById(id);
    }
}
