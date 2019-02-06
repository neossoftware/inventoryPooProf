package com.neosuniversity.inventory.domain;

import java.util.Stack;

public class AppInventory {

    public static void main(String[] args) {


        Marca marca = new Marca(12,"Apple");

        Proveedor proveedor = new Proveedor();
        proveedor.setId(1);
        proveedor.setNombre("CompuNegocio");

        Articulo articulo = new Articulo(23,"Mac Air", proveedor, marca);

        System.out.println(articulo.getMarca().getDescripcion());

        Stack<Integer> stack = new Stack<>();

        stack.push(7);


    }
}
