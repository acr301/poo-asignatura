package com.github.acr301.colegio;
import com.github.acr301.colegio.models.Carrera;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // la primera Carrera da el tipo de dato
        // el que va despues de new, es el que lleva al constructor
        Carrera conocidaCarrera = new Carrera("ingenieria en sistemas","ingsis",200.0);

        Carrera nuevaCarrera = new Carrera( );
        nuevaCarrera.setNombre("ingenieria en datos");
        nuevaCarrera.setCodigo("ingdat");
        nuevaCarrera.setPrecio(250.0);

        System.out.println(nuevaCarrera.getNombre());

        // si no estuviera el ToString en Carrera.java, nos daría la dirección de memoria
        // tambien nos agiliza no tener que usar getters/setters
        System.out.println(conocidaCarrera);
        JOptionPane.showMessageDialog(null,nuevaCarrera);
    }
}
