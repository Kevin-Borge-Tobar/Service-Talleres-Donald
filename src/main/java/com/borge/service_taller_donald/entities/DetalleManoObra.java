package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Detalle_Mano_Obra")
public class DetalleManoObra {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_detalle_mano_obra", nullable = false)
  private Integer idDetalleManoObra;
  @Column(name="id_orden_trabajo")
  private Integer ordenTrabajo;
  @Column(name="id_mano_obra")
  private Integer idManoObra;
  @Column(name="id_empleado")
  private Integer idEmpleado;
  private Integer unidades;
  @Column(name="fecha_inicio")
  private Date fechaInicio;
  @Column(name="fecha_fin")
  private Date fechaFin;
}
