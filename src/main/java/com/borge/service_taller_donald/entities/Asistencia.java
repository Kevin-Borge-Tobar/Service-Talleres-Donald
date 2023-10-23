package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Asistencia")
public class Asistencia {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_asistencia")
  private Integer idAsistencia;
  @Column(name = "id_empleado")
  private Integer idEmpleado;
  @Column(name = "id_tipo_asistencia")
  private Integer idTipoAsistencia;
  @Column (name="fecha_ingreso")
  private Date fechaIngreso;
  @Column(name="fecha_egreso")
  private Date fechaEgreso;
  private String origen;
}
