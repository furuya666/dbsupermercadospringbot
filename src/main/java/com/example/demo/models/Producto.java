package com.example.demo.models;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Producto {
	@Id
	private String idProducto;
	private double precio;
	private int stock;
	private String descripcion;
	private Date createAt;
	private String numero;
	/*
	 * *cardinalidad muchos a muchos 1 forma
	@JoinTable(
			name="Promocion_Producto",
			joinColumns = @JoinColumn(name="id_producto"),
			inverseJoinColumns =@JoinColumn(name="id_promocion")
			)
	@ManyToMany
	private List<Promocion>promociones;
	*/
	
	public void Prepsersist() {
		createAt =new Date();
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

}
