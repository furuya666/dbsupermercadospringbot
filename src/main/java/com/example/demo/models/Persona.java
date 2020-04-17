package com.example.demo.models;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
     @Id
	private String Ci;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String DireccioNnroPuerta;
	private String DireccionCalle;
	private String DireccionCiudad;
	private String foto;
	private Date createAt;
	private int telefono;
}

