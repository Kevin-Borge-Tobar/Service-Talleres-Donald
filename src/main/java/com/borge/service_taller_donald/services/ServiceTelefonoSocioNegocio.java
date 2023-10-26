package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.entities.TelefonoSocioNegocio;
import com.borge.service_taller_donald.repositories.TelefonoSocioNegocioRepository;
import com.borge.service_taller_donald.repositories.TelefonoSucursalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceTelefonoSocioNegocio implements IServiceTelefonoSocioNegocio{
    private TelefonoSocioNegocioRepository telefonoSocioNegocioRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TelefonoSocioNegocio> findAll() {
        return telefonoSocioNegocioRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TelefonoSocioNegocio findById(Integer id) {
        return telefonoSocioNegocioRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TelefonoSocioNegocio create(TelefonoSocioNegocio telefonoSocioNegocio) {
        return telefonoSocioNegocioRepository.save(telefonoSocioNegocio);
    }

    @Override
    @Transactional
    public TelefonoSocioNegocio updated(TelefonoSocioNegocio telefonoSocioNegocio, Integer id) {
        return telefonoSocioNegocioRepository.save(telefonoSocioNegocio);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        telefonoSocioNegocioRepository.deleteById(id);
    }
}
