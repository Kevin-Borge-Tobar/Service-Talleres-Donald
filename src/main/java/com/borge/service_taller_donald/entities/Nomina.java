package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Nomina")
public class Nomina {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_nomina")
  private Integer idNomina;
  @Column(name="id_sucursal")
  private Integer idSucursal;
  @Column(name="fecha_inicio")
  private Date fechaInicio;
  @Column(name="fecha_fin")
  private Date fechaFin;


}
