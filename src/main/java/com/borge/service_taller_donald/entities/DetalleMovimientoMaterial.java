package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Detalle_Movimiento_Material")
public class DetalleMovimientoMaterial {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_detalle_movimiento_material")
  private Integer idDetalleMovimientoMaterial;
  @Column(name="id_material")
  private Integer idMaterial;
  private  Integer linea;
  private Integer unidades;

}
