package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DocumentoFiscal;

import java.util.List;

public interface IServiceDocumentoFiscal {
    public List<DocumentoFiscal> findAll();

    public DocumentoFiscal findById(Integer id);

    public DocumentoFiscal create(DocumentoFiscal documentoFiscal);

    public DocumentoFiscal updated( DocumentoFiscal documentoFiscal, Integer id);

    public void deleteById(Integer id);
}
