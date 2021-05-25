package com.challenge.assessment.producto.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name= "id_producto")
    private int id_producto;

    @Column(name= "cod_producto")
    private String cod_producto;

    @Column(name= "nombre")
    private String nombre;

    @Column(name= "tecnologia")
    private String tecnologia;

    @Column(name= "numero_documento")
    private String numero_documento;

    @Column(name= "fecha_grabacion")
    private Date fecha_grabacion = new Date();
}
