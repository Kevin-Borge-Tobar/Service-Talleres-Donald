package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Proveedor")
public class Proveedor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_proveedor")
  private Integer idProveedor;
  @OneToOne
  @JoinColumn(name ="id_socio_negocio")
  private SocioNegocio socioNegocio;

}
