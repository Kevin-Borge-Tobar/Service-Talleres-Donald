package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.entities.TipoTelefono;
import com.borge.service_taller_donald.repositories.TipoTelefonoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceTipoTelefono implements IServiceTipoTelefono{
    private TipoTelefonoRepository tipoTelefonoRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TipoTelefono> findAll() {
        return tipoTelefonoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoTelefono findById(Integer id) {
        return tipoTelefonoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TipoTelefono create(TipoTelefono tipoTelefono) {
        return tipoTelefonoRepository.save(tipoTelefono);
    }

    @Override
    @Transactional
    public TipoTelefono updated(TipoTelefono tipoTelefono, Integer id) {
        return tipoTelefonoRepository.save(tipoTelefono);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        tipoTelefonoRepository.deleteById(id);
    }
}
