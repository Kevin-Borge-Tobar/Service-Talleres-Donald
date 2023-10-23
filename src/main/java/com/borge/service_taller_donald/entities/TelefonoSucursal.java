package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Telefono_Sucursal")
public class TelefonoSucursal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_telefono_sucursal")
  private Integer idTelefonoSucursal;
  private String numero;
  @Column(name="id_tipo_telefono")
  private Integer idTipoTelefono;

}
