package models;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String mostrarInfo() {
        return  "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio;
    }
}
