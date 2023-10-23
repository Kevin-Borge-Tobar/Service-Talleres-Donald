package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Detalle_Material")
public class DetalleMaterial {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_detalle_material")
  private Integer idDetalleMaterial;
  @Column(name = "id_detalle_mano_obra")
  private Integer idDetalleManoObra;
  @Column(name = "id_orden_trabajo")
  private Integer idOrdenTrabajo;
  @Column(name = "id_material")
  private Integer idMaterial;
  private Integer unidades;
  @Column(name = "precio_venta")
  private Integer precioVenta;


}
