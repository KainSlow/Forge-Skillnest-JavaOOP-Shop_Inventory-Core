package com;

import com.clases.TiendaElectronica;
import com.clases.ProductoElectrodomestico;
import com.clases.Televisor;
import com.clases.ComputadoraPortatil;

public class Aplicacion {
    
    public static void main(String[] args) {

        TiendaElectronica tienda = new TiendaElectronica();

        Televisor tv = new Televisor("HyperDisplay", 800.0, 3,  50.0, "16:9");
        ComputadoraPortatil portatil = new ComputadoraPortatil("Legion 50",  3500.0, 5, "Lenovo", 128, 7298);
        ProductoElectrodomestico producto = new ProductoElectrodomestico("Hervidor", 20.0);
        
        //Agregar con el inventario inicial de cada uno
        tienda.agregarProducto(tv); // inventario 3 
        tienda.agregarProducto(portatil); // inventario 5
        tienda.agregarProducto(producto); // inventario 0

        tienda.agregarProducto(producto); //Agrega 1 al inventario
        
        tienda.realizaVenta(producto); 
        tienda.realizaVenta(producto); //agotado
        
        tienda.realizaVenta(tv);
        tienda.realizaVenta(tv);
        tienda.realizaVenta(tv);
        tienda.realizaVenta(tv); //Agotado

        tienda.agregarProducto(tv); //Reponer

        tienda.realizaVenta(portatil);
        tienda.realizaVenta(portatil);
        tienda.realizaVenta(portatil);
        tienda.realizaVenta(portatil);
        tienda.realizaVenta(portatil);
        tienda.realizaVenta(portatil); //Agotado

        tienda.agregarProducto(portatil); //Reponer
        
        tienda.muestraProductosDisponibles();
    }
}
