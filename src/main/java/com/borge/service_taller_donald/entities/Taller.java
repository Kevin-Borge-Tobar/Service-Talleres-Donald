package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Taller")
public class Taller {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_taller")
  private Integer idTaller;
  @Column(name="razon_social")
  private String razonSocial;
  @Column(name = "nombre_comercial")
  private String nombreComercial;
  private String nit;
}
