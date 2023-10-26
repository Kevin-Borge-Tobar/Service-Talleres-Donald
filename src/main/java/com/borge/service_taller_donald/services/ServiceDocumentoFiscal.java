package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DireccionSucursal;
import com.borge.service_taller_donald.entities.DocumentoFiscal;
import com.borge.service_taller_donald.repositories.DocumentoFiscalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceDocumentoFiscal implements IServiceDocumentoFiscal{
    private DocumentoFiscalRepository documentoFiscalRepository;

    @Transactional(readOnly = true)
    @Override
    public List<DocumentoFiscal> findAll() {
        return documentoFiscalRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DocumentoFiscal findById(Integer id) {
        return documentoFiscalRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public DocumentoFiscal create(DocumentoFiscal documentoFiscal) {
        return documentoFiscalRepository.save(documentoFiscal);
    }

    @Override
    @Transactional
    public DocumentoFiscal updated(DocumentoFiscal documentoFiscal, Integer id) {
        return documentoFiscalRepository.save(documentoFiscal);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        documentoFiscalRepository.deleteById(id);
    }
}
