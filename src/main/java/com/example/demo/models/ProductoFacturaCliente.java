package com.example.demo.models;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

import org.hibernate.annotations.Persister;
@Entity
public class ProductoFacturaCliente {
	@Id
	private int id;
	@ManyToOne
	private Producto producto;
	@ManyToOne
	private Factura factura;
	@ManyToOne
	private Cliente cliente;
	private Date createAt;
	
	@PrePersist
	public void Prepersist() {
		createAt=new Date();
	}

}
