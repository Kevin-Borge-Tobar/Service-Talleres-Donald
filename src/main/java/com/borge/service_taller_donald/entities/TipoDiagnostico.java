package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Tipo_Diagnostico")
public class TipoDiagnostico {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column (name= "id_tipo_diagnostico")
  private Integer idTipoDiagnostico;
  private String descripcion;
}
