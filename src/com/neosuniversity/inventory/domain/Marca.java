package com.neosuniversity.inventory.domain;

import java.util.*;

/**
 * @author Mario Hidalgo
 */
public class Marca {

    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String descripcion;

    /**
     * Default constructor
     */
    public Marca() {
    }


    public Marca(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
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

    @Override
    public String toString() {
        return "Marca{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}