package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Movimiento_Material")
public class MovimientoMaterial {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_movimiento_material")
  private Integer idMovimientoMaterial;
  @Column(name = "id_bodega")
  private Integer idBodega;
  @Column(name="id_sucursual")
  private Integer idSucursal;
  @Column(name="id_tipo_movimiento")
  private Integer idTipoMovimiento;
  @Column(name="fecha_emision")
  private Date fechaEmision;
  private String referencia;

}
