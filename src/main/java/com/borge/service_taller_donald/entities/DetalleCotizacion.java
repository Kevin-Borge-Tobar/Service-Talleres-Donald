package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "detalle_cotizacion")
public class DetalleCotizacion {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_detalle_cotizacion")
  private Integer idDetalleCotizacion;
  @Column(name="id_cotizacion")
  private Integer idCotizacion;
  @Column(name="id_material")
  private Integer idMaterial;
  private Integer unidades;
  @Column(name="precio_compra")
  private Float  precioCompra;

}
