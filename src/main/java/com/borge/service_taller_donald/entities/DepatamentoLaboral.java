package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Depatamento_Laboral")
public class DepatamentoLaboral {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_departamento_labotal")
  private Integer idDepartamentoLaboral;
  private String Descripcion;
}
