package com.example.demo.models;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Carrito {
	@Id
 private int idCarrito;
 private String estado;
 private String descripcion;
 private Date createAt;
  @PrePersist
 public void Prepersist() {
	 createAt =new Date();
 }
}
