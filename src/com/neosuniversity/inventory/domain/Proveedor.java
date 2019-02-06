package com.neosuniversity.inventory.domain;

import java.util.*;

/**
 * @author Mario Hidalgo
 */
public class Proveedor {

    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String nombre;


    /**
     * Default constructor
     */
    public Proveedor() {
    }

    public Proveedor(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}