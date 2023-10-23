package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Puesto_Laboral")
public class PuestoLaboral {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_puesto_laboral")
  private Integer idPuestoLaboral;
  private String descripcion;
  private String estado;
}
