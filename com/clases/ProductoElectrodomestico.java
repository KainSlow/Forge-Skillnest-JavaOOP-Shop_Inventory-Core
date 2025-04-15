package com.clases;

public class ProductoElectrodomestico {

    protected String nombre;
    protected double precio;
    protected int cantidadDisponible;

    public ProductoElectrodomestico(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        cantidadDisponible = 0;
    }

    public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public void mostrarInformacion(){
        System.out.println("Detalles producto:");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tPrecio: " + String.valueOf(precio));
        System.out.println("\tCantidad disponible: " + String.valueOf(cantidadDisponible));
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}
