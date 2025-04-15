package com.clases;

public class Televisor extends ProductoElectrodomestico{

    private double tamañoPantalla; // diagonal/pulgadas
    private String resolucion; //Ejemplo: 4:3, 16:9

    public Televisor(String nombre, double precio, double tamañoPantalla, String resolucion) {
        super(nombre, precio);
        this.tamañoPantalla = tamañoPantalla;
        this.resolucion = resolucion;
    }

    public Televisor(String nombre, double precio, int cantidadDisponible, double tamañoPantalla, String resolucion) {
        super(nombre, precio, cantidadDisponible);
        this.tamañoPantalla = tamañoPantalla;
        this.resolucion = resolucion;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Televisor");
        super.mostrarInformacion();
        System.out.println("\tTamaño pantalla: " + String.valueOf(tamañoPantalla) + '"');
        System.out.println("\tResolución: " + resolucion);
    }
}
