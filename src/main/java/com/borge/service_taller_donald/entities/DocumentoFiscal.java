package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Focumento_Fiscal")
public class DocumentoFiscal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "numero")
  private Integer numero;
  private String serie;
  @Column(name="id_tipo_documento_fiscal")
  private Integer idTipoDocumentoFiscal;
  @Column(name="fecha_emision")
  private Date fechaEmision;
  private String nit;
  private Float total;
  private Float iva;
  private String estado;
}
