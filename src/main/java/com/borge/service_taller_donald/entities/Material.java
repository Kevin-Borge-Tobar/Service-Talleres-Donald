package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Material")
public class Material {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_material")
  private Integer idMaterial;
  private String decripcion;
  @Column(name = "precio_compra")
  private Float precioCompra;
  @Column(name= "precio_venta")
  private Float precioVenta;
  @Column(name = "Saldo")
  private Integer saldo;
}
