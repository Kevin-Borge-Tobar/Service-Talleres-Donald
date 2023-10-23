package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Pedido")
public class Pedido {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id-pedido")
  private Integer idPedido;
  @Column(name="id_cotizacion")
  private Integer idCotizacion;
  @Column(name="id_requision")
  private Integer idRequisicion;


}
