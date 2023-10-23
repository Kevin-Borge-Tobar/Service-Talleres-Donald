package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Orden_Trabajo")
public class OrdenTrabajo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_orden_trabajo", nullable = false)
  private Integer idOrdenTrabajo;
  @Column(name="id_cita")
  private Integer idCita;
  @Column(name="fecha_emision")
  @Temporal(TemporalType.DATE)
  private Date fechaEmision;
  private String estado;
}
