package com.eternamania.entities;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="proveedores")
public class Proveedor implements Serializable {

	 private static final long serialVersionUID = 1L;
	
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id_proveedor;
 
 private String nombre;
 
 @Column(name="mail")
 private String email;
 
 private String iva_incluido;
 
	
}
