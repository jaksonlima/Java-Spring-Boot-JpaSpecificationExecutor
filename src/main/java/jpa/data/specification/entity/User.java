package jpa.data.specification.entity;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "lm_user")
public class User {

  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_lm_user")
  private Integer id;

  @Column(name = "NOME")
  private String nome;

  @Column(name = "IDADE")
  private BigInteger idade;

  @Column(name = "DHINCLUSAO")
  private Date dhInclusao;

}
