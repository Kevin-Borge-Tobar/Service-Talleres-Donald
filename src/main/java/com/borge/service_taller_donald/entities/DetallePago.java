package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Detalle_Pago")
public class DetallePago {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_detalle_pago")
  private Integer idDetallePago;
  private Integer numero;
  private String serie;
  @Column(name="id_tipo_documento_fiscal")
  private Integer idTipoDocumentoFiscal;
  @Column(name="id_tipo_pago")
  private Integer idTipoPago;


}
