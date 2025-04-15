package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico{
    
    private String marca;
    private int memoriaRam;
    private int numeroSerie;
    
    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, int memoriaRam,
            int numeroSerie) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.numeroSerie = numeroSerie;
    }
    
    public ComputadoraPortatil(String nombre, double precio, String marca, int memoriaRam, int numeroSerie) {
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
        System.out.println("\tMemoria Ram: " + String.valueOf(memoriaRam) + "GB");
        System.out.println("\tNúmero de serie: " + String.valueOf(numeroSerie));
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getMemoriaRam() {
        return memoriaRam;
    }
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public int getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}
