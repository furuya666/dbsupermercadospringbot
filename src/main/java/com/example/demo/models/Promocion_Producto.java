package com.example.demo.models;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
public class Promocion_Producto {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;
	@ManyToOne
	private Promocion idPromocion;
	@ManyToOne
	private Producto idProducto;
	private int stockPromocion;
	private Date createAt;
	@PrePersist
	public void Prepersist() {
		createAt=new Date();
	}

}
