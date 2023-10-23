package com.borge.service_taller_donald.services;

import com.borge.service_taller_donald.entities.Material;

import java.util.List;

public interface IServiceMaterial {
  public List<Material> findAll();
  public Material findById(Integer id);
  public Material create(Material material);
  public Material updated( Material material, Integer id);
  public void  deleteById(Integer id );
}
