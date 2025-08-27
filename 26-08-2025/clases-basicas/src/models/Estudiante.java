package models;

public class Estudiante {
    private String nombre;
    private String matricula;
    private double promedio;

    public Estudiante(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public Boolean aproboONo(){
        return promedio >= 70;
    }

    public String mostrarInfoEstudiante(){
        return "Estudiante\n" + nombre + "\n" + matricula + "\n" + promedio + "\n" + "aprobo: " + aproboONo() + "\n";
    }
}


