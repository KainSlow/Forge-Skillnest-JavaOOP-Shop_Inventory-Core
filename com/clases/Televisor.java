package com.clases;

public class Televisor extends ProductoElectrodomestico{

    private double medidaPantalla; // diagonal/pulgadas
    private String resolucion; //Ejemplo: 4:3, 16:9

    public Televisor(String nombre, double precio, double medidaPantalla, String resolucion) {
        super(nombre, precio);
        this.medidaPantalla = medidaPantalla;
        this.resolucion = resolucion;
    }

    public Televisor(String nombre, double precio, int cantidadDisponible, double medidaPantalla, String resolucion) {
        super(nombre, precio, cantidadDisponible);
        this.medidaPantalla = medidaPantalla;
        this.resolucion = resolucion;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Televisor");
        super.mostrarInformacion();
        System.out.println("\tTamaño pantalla: " + String.valueOf(medidaPantalla) + '"');
        System.out.println("\tResolución: " + resolucion);
    }
}
