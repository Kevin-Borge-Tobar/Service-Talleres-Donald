package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Bodega")
public class Bodega {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_bodega")
  private Integer idBodega;
  @Column(name="id_sucursal")
  private Integer idSucursal;
}
