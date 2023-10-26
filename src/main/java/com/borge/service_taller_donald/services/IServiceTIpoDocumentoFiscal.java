package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.TipoDocumentoFiscal;

import java.util.List;

public interface IServiceTIpoDocumentoFiscal {
    public List<TipoDocumentoFiscal> findAll();

    public TipoDocumentoFiscal findById(Integer id);

    public TipoDocumentoFiscal create(TipoDocumentoFiscal tipoDocumentoFiscal);

    public TipoDocumentoFiscal updated(TipoDocumentoFiscal tipoDocumentoFiscal, Integer id);

    public void deleteById(Integer id);
}
