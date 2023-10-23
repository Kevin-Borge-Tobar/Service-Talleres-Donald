package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Diagnostico")
public class Diagnostico {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_diagnostico")
  private Integer idDiagnostico;
  @Column(name="id_cita")
  private Integer idCita;
  @Column(name = "id_tipo_diagnostico")
  private Integer idTipoDiagnostico;


}
