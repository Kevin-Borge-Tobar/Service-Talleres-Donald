package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.entities.TipoPago;
import com.borge.service_taller_donald.repositories.TipoPagoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceTipoPago implements IServiceTipoPago {
    private TipoPagoRepository tipoPagoRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TipoPago> findAll() {
        return tipoPagoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoPago findById(Integer id) {
        return tipoPagoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TipoPago create(TipoPago tipoPago) {
        return tipoPagoRepository.save(tipoPago);
    }

    @Override
    @Transactional
    public TipoPago updated(TipoPago tipoPago, Integer id) {
        return tipoPagoRepository.save(tipoPago);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        tipoPagoRepository.deleteById(id);
    }
}
