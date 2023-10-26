package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Petalle_Pedio")
public class DetallePedido {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_detalle_pedido")
  private Integer idDetallePedido;
  @Column(name = "id_pedido")
  private Integer idPedido;
  @Column(name = "id_material")
  private Integer idMaterial;
  @Column(name = "unidades_recibidas")
  private  Integer unidadesRecibidas;
  @Column(name="precio_compra")
  private Integer precioCompra;
}
