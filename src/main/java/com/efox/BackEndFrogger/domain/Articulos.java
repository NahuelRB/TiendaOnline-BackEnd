package com.efox.BackEndFrogger.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name="articulos")
public class Articulos implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_articulo")
    private int idArticulo;
    
    @Column(name="codigo")
    private String codigo;
    
    @Column(name="id_proveedor")
    private int idProveedor;
        
    @Column(name="descripcion")
    private String descripcion;
    
    
    @Column(name="marca")
    private String marca;
    
    @Column(name="categoria")
    private String categoria;
    
    @Column(name="unidad")
    private int unidad;
    
    @Column(name="observaciones")
    private String observaciones;
    
    @Column(name="moneda")
    private String moneda;
    
    @Column(name="iva")
    private double iva;
    
    @Column(name="precio")
    private double precio;
    
    @Column(name="comentarios")
    private String comentarios;
    
    @Column(name="alta_fecha")
    private Date altaFecha;
    
    @Column(name="modi_fecha")
    private Date modiFecha;
    
    @Column(name="baja_fecha")
    private Date bajaFecha;
    
    @Column(name="filler")
    private String filler;
    
    @Column(name="clave")
    private String clave;
        
}
