package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Sucursal")
public class Sucursal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_sucursal")
  private Integer idSucursal;
  private String nombre;
  @Column(name = "id_taller")
  private Integer idTaller;

}
