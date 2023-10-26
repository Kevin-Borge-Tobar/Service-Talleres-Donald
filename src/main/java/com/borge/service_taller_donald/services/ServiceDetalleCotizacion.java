package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Cliente;
import com.borge.service_taller_donald.entities.DetalleCotizacion;
import com.borge.service_taller_donald.repositories.DetalleCotizacionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDetalleCotizacion implements IServiceDetalleCotizacion{
    private DetalleCotizacionRepository detalleCotizacionRepository;

    @Transactional(readOnly = true)
    @Override
    public List<DetalleCotizacion> findAll() {
        return detalleCotizacionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleCotizacion findById(Integer id) {
        return detalleCotizacionRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DetalleCotizacion create(DetalleCotizacion detalleCotizacion) {
        return detalleCotizacionRepository.save(detalleCotizacion);
    }

    @Override
    @Transactional
    public DetalleCotizacion updated(DetalleCotizacion detalleCotizacion, Integer id) {
        return detalleCotizacionRepository.save(detalleCotizacion);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        detalleCotizacionRepository.deleteById(id);
    }
}
