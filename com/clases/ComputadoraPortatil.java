package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico{
    
    private String marca;
    private String memoriaRam;
    private int numeroSerie;
    
    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, String memoriaRam,
            int numeroSerie) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.numeroSerie = numeroSerie;
    }
    
    public ComputadoraPortatil(String nombre, double precio, String marca, String memoriaRam, int numeroSerie) {
        super(nombre, precio);
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Computadora Portátil");
        super.mostrarInformacion();
        System.out.println("\tMarca: " + marca);
        System.out.println("\tMemoria Ram: " + memoriaRam);
        System.out.println("\tNúmero de serie: " + numeroSerie);
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public int getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}
