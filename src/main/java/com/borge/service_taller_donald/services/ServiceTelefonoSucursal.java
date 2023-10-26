package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.entities.TelefonoSucursal;
import com.borge.service_taller_donald.repositories.TelefonoSucursalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceTelefonoSucursal implements IServiceTelefonoSucursal{
    private TelefonoSucursalRepository telefonoSucursalRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TelefonoSucursal> findAll() {
        return telefonoSucursalRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TelefonoSucursal findById(Integer id) {
        return telefonoSucursalRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TelefonoSucursal create(TelefonoSucursal telefonoSucursal) {
        return telefonoSucursalRepository.save(telefonoSucursal);
    }

    @Override
    @Transactional
    public TelefonoSucursal updated(TelefonoSucursal telefonoSucursal, Integer id) {
        return telefonoSucursalRepository.save(telefonoSucursal);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        telefonoSucursalRepository.deleteById(id);
    }
}
