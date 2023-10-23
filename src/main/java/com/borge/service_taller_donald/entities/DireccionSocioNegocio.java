package com.borge.service_taller_donald.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Direccion_Socio_Negocio")
public class DireccionSocioNegocio {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_direccion_socio_negocio")
  private Integer idDireccionSocioSocioNegocio;
  @Column(name = "id_socio_negocio")
  private Integer idSucursal;
  @Column(name = "id_municipio")
  private Integer idMunicipio;
  @Column(name = "id_departamento")
  private Integer idDepartamento;
  @Column(name = "id_tipo_direccion")
  private Integer idTipoDireccion;
  private String zona;
  private String calle;
  private String avenida;
  private String colonia;
  private String otros;

}
