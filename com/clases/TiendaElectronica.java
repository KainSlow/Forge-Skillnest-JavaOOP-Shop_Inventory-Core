package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {

    private ArrayList<ProductoElectrodomestico> listaDeProductos;

    public TiendaElectronica(){
        listaDeProductos = new ArrayList<>();
    }

    public void agregarProducto(ProductoElectrodomestico producto){

        if(listaDeProductos.contains(producto)){
            producto.setCantidadDisponible(producto.getCantidadDisponible() + 1);
            return;
        }

        listaDeProductos.add(producto);
    }

    public void muestraProductosDisponibles(){
        System.out.println("Lista de Productos Disponibles:");
        for(ProductoElectrodomestico producto : listaDeProductos){
            producto.mostrarInformacion();
            System.out.println("");
        }
    }

    public ProductoElectrodomestico buscaProducto(String nombre){
        
        for(ProductoElectrodomestico producto: listaDeProductos){
            if(producto.nombre.equalsIgnoreCase(nombre)){
                return producto;
            }
        }
        System.out.println("Producto no encontrado");
        return null;
    }

    public void realizaVenta(ProductoElectrodomestico producto){
        int cantidad = producto.getCantidadDisponible();
        if(cantidad > 0){
            producto.setCantidadDisponible(cantidad-1);
            System.out.println("Venta de " + producto.getNombre() + " realizada con éxito!");
            return;
        }

        System.out.println("Producto: " + producto.getNombre() + " agotado :(");
    }
}
