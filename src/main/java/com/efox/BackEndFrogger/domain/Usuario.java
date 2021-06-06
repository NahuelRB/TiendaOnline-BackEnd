package com.efox.BackEndFrogger.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private int idUsuario;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;
        
    @Column(name="id_id_usuario")
    private int idIdUsuario;
    
    
    @Column(name="login")
    private String login;
    
    @Column(name="password")
    private String password;
    
    @Column(name="activo")
    private String activo;
    
    @Column(name="factura")
    private String factura;
    
    @Column(name="id_perfil")
    private int idPerfil;
    
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
}
