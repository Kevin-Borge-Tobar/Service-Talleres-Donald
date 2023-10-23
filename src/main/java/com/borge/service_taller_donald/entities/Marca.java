package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Marca")
public class Marca {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_marca")
  public Integer idMarca;
  public Integer descripcion;
}
