package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Requisicion")
public class Requisicion {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_requisicion")
  private Integer idRequisicion;
  @JoinColumn(name = "id_taller")
  @ManyToOne
  private Taller taller;
  @JoinColumn(name="id_empleado")
  @ManyToOne
  private Empleado empleado;
  @Column(name = "fecha_emision")
  @Temporal(TemporalType.DATE)
  private Date fechaEmision;
}
