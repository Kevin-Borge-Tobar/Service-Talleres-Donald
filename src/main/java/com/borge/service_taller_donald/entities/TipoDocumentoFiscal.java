package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tiTpo_Documento_Fiscal")
public class TipoDocumentoFiscal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_tipo_documento_fiscal")
  private Integer idTipoDocumentoFiscal;
  private String descripcion;


}
