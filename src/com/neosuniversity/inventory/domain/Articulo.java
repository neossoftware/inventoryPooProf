package com.neosuniversity.inventory.domain;

import com.neosuniversity.inventory.domain.Proveedor;

import java.util.*;

/**
 * @author Mario Hidalgo
 */
public class Articulo {

    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String descripcion;


    /**
     *
     */
    private Proveedor proveedor;

    /**
     *
     */
    private Marca marca;


    /**
     * Default constructor
     */
    public Articulo() {
    }

    public Articulo(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Articulo(Integer id, String descripcion, Proveedor proveedor, Marca marca) {
        this.id = id;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        this.marca = marca;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", proveedor=" + proveedor +
                ", marca=" + marca +
                '}';
    }
}