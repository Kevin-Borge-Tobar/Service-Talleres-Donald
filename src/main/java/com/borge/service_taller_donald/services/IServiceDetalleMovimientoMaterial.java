package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.DetalleCotizacion;
import com.borge.service_taller_donald.entities.DetalleMaterial;
import com.borge.service_taller_donald.entities.DetalleMovimientoMaterial;

import java.util.List;

public interface IServiceDetalleMovimientoMaterial {
    public List<DetalleMovimientoMaterial> findAll();

    public DetalleMovimientoMaterial findById(Integer id);

    public DetalleMovimientoMaterial create(DetalleMovimientoMaterial detalleMovimientoMaterial);

    public DetalleMovimientoMaterial updated(DetalleMovimientoMaterial detalleMovimientoMaterial, Integer id);

    public void deleteById(Integer id);
}
