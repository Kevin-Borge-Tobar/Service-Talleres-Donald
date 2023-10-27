package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.ContratoLaboral;
import com.borge.service_taller_donald.entities.Cotizacion;
import com.borge.service_taller_donald.repositories.CotizacionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceCotizacion implements IServiceCotizacion{
    private CotizacionRepository cotizacionRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Cotizacion> findAll() {
        return cotizacionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cotizacion findById(Integer id) {
        return cotizacionRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cotizacion create(Cotizacion cotizacion) {
        return cotizacionRepository.save(cotizacion);
    }

    @Override
    public Cotizacion updated(Cotizacion cotizacion, Integer id) {
        return cotizacionRepository.save(cotizacion);
    }

    @Override
    public void deleteById(Integer id) {
        cotizacionRepository.deleteById(id);

    }
}
