package com.example.demo.models;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empleado {
	@Id
	private String idEmpleado;
	private Date fechaingreso;
	private String descripcion;
	private Date createAt;
	public void Prepersist() {
		createAt =new Date();
	}
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public Date getFechaingreso() {
		return fechaingreso;
	}
	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
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

}
