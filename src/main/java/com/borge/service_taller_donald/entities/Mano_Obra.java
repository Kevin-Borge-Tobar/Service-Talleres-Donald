package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Mano_Obra")
public class Mano_Obra {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idManoObra")
  private Integer idManoObra;
  private String descripcion;
  private Float precio;

}
