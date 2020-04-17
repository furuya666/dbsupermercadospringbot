package com.example.demo.models;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProductoCarritoCliente {
@Id
	 private int id;
@ManyToOne
	 private Producto producto;
@ManyToOne
	 private Carrito carrito;
@ManyToOne
	 private Cliente cliente;
	 private Date createAt;
	  public void Prepersist() {
		  createAt =new Date();
	  }
	 
}
