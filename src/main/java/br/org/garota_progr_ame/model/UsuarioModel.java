package br.org.garota_progr_ame.model;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;

@Entity(name = "usuario")
@Table(name = "tblusuario")
public class UsuarioModel implements Serializable {

  private static final long serialVersionUID = 1;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;

  @Column(name = "\"nome\"", nullable = true)
  private String nome;

  @Column(name = "\"email\"", nullable = false)
  private String email;

  @Column(name = "\"matricula\"", nullable = true)
  private String matricula;

  @Column(name = "\"admin\"", nullable = true)
  private Integer admin;

  @Column(name = "\"DATA_REGISTRO\"", nullable = true)
  private Timestamp dataRegistro;

  public UsuarioModel() {
  }

  public UsuarioModel(String nome, String email, String matricula, Integer admin) {
    this.nome = nome;
    this.email = email;
    this.matricula = matricula;
    this.admin = admin;
  }

  public Integer getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public Integer getAdmin() {
    return admin;
  }

  public void setAdmin(Integer admin) {
    this.admin = admin;
  }

  public Timestamp getDataRegistro() {
    return dataRegistro;
  }

  public void setDataRegistro(Timestamp dataRegistro) {
    this.dataRegistro = dataRegistro;
  }

 
  
}