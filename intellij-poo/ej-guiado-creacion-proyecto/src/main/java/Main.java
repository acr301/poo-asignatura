import models.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Silvio", 27);
        System.out.println(person.showInfo());

        Coche coche = new Coche("Suzuki", "Jimmy", 2017);
        System.out.println(coche.mostrarInfoCoche());

        Libro libro = new Libro("Das Parfum ", "Patrick Süskind ", 280);
        System.out.println(libro.descripcionLibro());

        CuentaBancaria cuenta = new CuentaBancaria("Silvio Mejia",255.0);
        cuenta.depositar(550.0);
        cuenta.retirar(700.0);
        System.out.println(cuenta.mostrarInfoBancaria());

        Estudiante estudiante = new Estudiante("Andres","systech",60.0);
        System.out.println(estudiante.mostrarInfoEstudiante());

    }
}
