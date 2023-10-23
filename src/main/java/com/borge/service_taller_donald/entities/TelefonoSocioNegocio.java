package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Telefono_Socio_Negocio")
public class TelefonoSocioNegocio {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_telefono_socio", nullable = false)
  private Integer idTelefonoSocio;
  private String telefono;
  @Column(name="id_tipo_telefono")
  private Integer idTipoTelefono;


}
