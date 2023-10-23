package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@Table(name = "Tipo_Socio_Negocio")
public class TipoSocioNegocio {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_tipo_socio_negocio")
  private Integer idTipoSocioNegocio;
  private String descripcion;
  private String persona;
}
