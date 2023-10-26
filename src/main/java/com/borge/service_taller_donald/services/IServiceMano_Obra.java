package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Mano_Obra;

import java.util.List;

public interface IServiceMano_Obra {
    public List<Mano_Obra> findAll();

    public Mano_Obra findById(Integer id);

    public Mano_Obra create(Mano_Obra mano_obra);

    public Mano_Obra updated(Mano_Obra mano_obra, Integer id);

    public void deleteById(Integer id);
}
