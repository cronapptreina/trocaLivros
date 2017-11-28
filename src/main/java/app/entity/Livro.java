package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;


/**
 * Classe que representa a tabela LIVRO
 * @generated
 */
@Entity
@Table(name = "\"LIVRO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Livro")
public class Livro implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "ano", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String ano;

  /**
  * @generated
  */
  @Column(name = "titulo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String titulo;

  /**
  * @generated
  */
  @Column(name = "foto", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="bln1eJh9gHAAAAAAAAAAXD92KLyqy9lFa91jertipwdZExAfp-JyrrPLHgFG6SFM")
  
  private java.lang.String foto;

  /**
   * Construtor
   * @generated
   */
  public Livro(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Livro setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém ano
   * return ano
   * @generated
   */
  
  public java.lang.String getAno(){
    return this.ano;
  }

  /**
   * Define ano
   * @param ano ano
   * @generated
   */
  public Livro setAno(java.lang.String ano){
    this.ano = ano;
    return this;
  }

  /**
   * Obtém titulo
   * return titulo
   * @generated
   */
  
  public java.lang.String getTitulo(){
    return this.titulo;
  }

  /**
   * Define titulo
   * @param titulo titulo
   * @generated
   */
  public Livro setTitulo(java.lang.String titulo){
    this.titulo = titulo;
    return this;
  }

  /**
   * Obtém foto
   * return foto
   * @generated
   */
  
  public java.lang.String getFoto(){
    return this.foto;
  }

  /**
   * Define foto
   * @param foto foto
   * @generated
   */
  public Livro setFoto(java.lang.String foto){
    this.foto = foto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Livro object = (Livro)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
