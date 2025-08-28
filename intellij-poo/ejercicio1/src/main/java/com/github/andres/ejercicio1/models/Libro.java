package com.github.andres.ejercicio1.models;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String descripcionLibro() {
        return "Descripción Libro\nTitulo: " + this.titulo + "\nAutor: " + this.autor + "\nPaginas: " + this.numPaginas + "\n";
    }
}
