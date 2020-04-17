package com.example.demo.models;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
@Entity
public class Factura {
	@Id
	private String idFactura;
	private Date fecha;
	private Date hora;
	private Date createAt;
	@PrePersist
	public void Prepersist() {
		createAt=new Date();
		
	}
}
