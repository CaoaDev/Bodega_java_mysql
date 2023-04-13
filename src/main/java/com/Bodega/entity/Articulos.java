package com.Bodega.entity;

import javax.persistence.*;

@Entity
@Table(name = "Articulos")
public class Articulos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id") private Integer id;
    @Column(name = "Nombre") private String nombre;
    @Column(name = "Codigo") private String codigo;
    @Column(name = "Precio") private Integer precio;
    @Column(name = "Existencia") private Integer existencia;

    public Articulos(){}

    public Articulos(Integer id, String nombre, String codigo, Integer precio, Integer existencia) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.existencia = existencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }
}