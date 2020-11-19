package br.org.garota_progr_ame.domain;

import java.io.Serializable;
import java.sql.*;

import javax.persistence.*;

@Entity(name = "br.org.garota_progr_ame.domain.TelaDomain")
@Table(name = "AG_T_TELA")
public class TelaDomain implements Serializable {

  private static final long serialVersionUID = 1;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"ID_TELA\"")
  private Integer idTela;

  @Column(name = "\"TELA\"", nullable = true)
  private String tela;

  @Column(name = "\"CAMINHO\"", nullable = true)
  private String caminho;

  @Column(name = "\"DATA_REGISTRO\"", nullable = true)
  private Timestamp dataRegistro;


  public Integer getIdTela() {
    return idTela;
  }

  public String getTela() {
    return tela;
  }

  public void setTela(String tela) {
    this.tela = tela;
  }

  public String getCaminho() {
    return caminho;
  }

  public void setCaminho(String caminho) {
    this.caminho = caminho;
  }

  public Timestamp getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(Timestamp dataRegistro) {
    this.dataRegistro = dataRegistro;
  }


  

}