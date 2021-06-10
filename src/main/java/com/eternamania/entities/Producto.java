package com.eternamania.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_producto;

	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	private Proveedor proveedor;

	private String codigo;

	private String descripcion;

	private String marca;

	private int unidad;

	private String moneda;

	private float iva;

	private float precio;

	private String comentarios;

	private Date alta_fecha;

	private Date modi_fecha;

	private Date baja_fecha;

	private String observaciones;

	//probaadsdsadsads
	
}
