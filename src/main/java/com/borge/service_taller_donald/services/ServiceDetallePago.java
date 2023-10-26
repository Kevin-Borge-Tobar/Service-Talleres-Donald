package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetalleNomina;
import com.borge.service_taller_donald.entities.DetallePago;
import com.borge.service_taller_donald.repositories.DetallePagoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDetallePago implements IServiceDetallePago{
    DetallePagoRepository detallePagoRepository;

    @Transactional(readOnly = true)
    @Override
    public List<DetallePago> findAll() {
        return detallePagoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DetallePago findById(Integer id) {
        return detallePagoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DetallePago create(DetallePago detallePago) {
        return detallePagoRepository.save(detallePago);
    }

    @Override
    @Transactional
    public DetallePago updated(DetallePago detallePago, Integer id) {
        return detallePagoRepository.save(detallePago);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        detallePagoRepository.deleteById(id);
    }
}
