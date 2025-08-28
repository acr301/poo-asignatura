package com.github.andres.ejercicio1.models;

public class Person {
    private String name;
    private int age;

    // constructor

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String showInfo(){
        return "Persona\nNombre: " + name + ", Edad: " + age + "\n";
    }
}
