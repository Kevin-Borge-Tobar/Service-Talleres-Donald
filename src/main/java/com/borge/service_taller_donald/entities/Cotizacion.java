package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Cotizacion")
public class Cotizacion {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_cotizaicion")
  private Integer idCotizacion;
  @JoinColumn(name = "id_requisicion")
  @ManyToOne
  private Requisicion requisicion;
  @JoinColumn(name = "id_proveedor")
  @ManyToOne
  private Proveedor proveedor;
  @Column(name = "fecha_emision")
  private Date fechaEmision;
}
