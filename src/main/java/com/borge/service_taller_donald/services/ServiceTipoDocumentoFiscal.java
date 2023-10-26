package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Nomina;
import com.borge.service_taller_donald.entities.TipoDocumentoFiscal;
import com.borge.service_taller_donald.repositories.TipoDocumentoFiscalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceTipoDocumentoFiscal implements IServiceTIpoDocumentoFiscal{
    private TipoDocumentoFiscalRepository tipoDocumentoFiscalRepository;

    @Transactional(readOnly = true)
    @Override
    public List<TipoDocumentoFiscal> findAll() {
        return tipoDocumentoFiscalRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoDocumentoFiscal findById(Integer id) {
        return tipoDocumentoFiscalRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public TipoDocumentoFiscal create(TipoDocumentoFiscal tipoDocumentoFiscal) {
        return tipoDocumentoFiscalRepository.save(tipoDocumentoFiscal);
    }

    @Override
    @Transactional
    public TipoDocumentoFiscal updated(TipoDocumentoFiscal tipoDocumentoFiscal, Integer id) {
        return tipoDocumentoFiscalRepository.save(tipoDocumentoFiscal);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        tipoDocumentoFiscalRepository.deleteById(id);
    }
}
