package br.org.garota_progr_ame.domain;


import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "AG_T_TIPO_PERFIL")
public class TipoPerfilDomain implements Serializable {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"ID_TIPO_PERFIL\"", nullable = false)
  private Integer idTipoPerfil;

  @Column(name = "\"TIPO_PERFIL\"", nullable = true)
  private String tipoPerfil;

  @Column(name = "\"DATA_REGISTRO\"", nullable = true)
  private Timestamp dataRegistro;

  public Integer getIdTipoPerfil() {
    return idTipoPerfil;
  }

  public void setIdTipoPerfil(Integer idTipoPerfil) {
    this.idTipoPerfil = idTipoPerfil;
  }

  public String getTipoPerfil() {
    return tipoPerfil;
  }

  public void setTipoPerfil(String tipoPerfil) {
    this.tipoPerfil = tipoPerfil;
  }

  public Timestamp getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(Timestamp dataRegistro) {
    this.dataRegistro = dataRegistro;
  }

  @Override
  public String toString() {
    return "TipoPerfilDomain [dataRegistro=" + dataRegistro + ", idTipoPerfil=" + idTipoPerfil + ", tipoPerfil="
        + tipoPerfil + "]";
  }

  

}