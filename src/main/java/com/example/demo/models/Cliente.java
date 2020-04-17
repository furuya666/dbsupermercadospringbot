package com.example.demo.models;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
 private String idPersona;
 private Date createAt;
 private int nit;
 public void Prepersist() {
	 createAt =new Date();
 }
}
