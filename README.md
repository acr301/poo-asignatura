# Asignatura: METODOLOGIA Y PROGRAMACION ORIENTADA A OBJETOS I 

Este repositorio contiene ejercicios de programación orientada a objetos organizados como un proyecto **multi-módulo de Maven**.  
Cada capítulo o actividad está separado en su propio módulo independiente.
El wrapper de Maven está instalado por lo que no es necesario tenerlo instalado.
Cada módulo que deberá llevar una clase main ejecutable tiene su propio `pom.xml` configurado con el plugin [Exec Maven Plugin](https://www.mojohaus.org/exec-maven-plugin/) 

En el ámbito de IntelliJ + Maven entiéndase lo siguiente:
Project > Module > (donde el source) Package > Models 



## Estructura:


intellij-poo/                 # Proyecto padre (solo pom.xml, no código)
 ├── pom.xml                  # Define <packaging>pom</packaging>, lista módulos
 ├── clases-basicas/          # Módulo 1
 │    ├── pom.xml             # Config propio + plugin exec
 │    └── src/
 │         └── main/java/com/github/andres/clasesbasicas/
 │              ├── Main.java
 │              └── models/
 │                   ├── Person.java
 │                   └── ...
 │         └── test/java/...  # (opcional: pruebas JUnit)
 │
 ├── cap2-cap3-practica/      # Módulo 2
 │    ├── pom.xml
 │    └── src/main/java/com/github/andres/cap2cap3/
 │         ├── Main.java
 │         └── models/
 │              ├── Libro.java
 │              └── ...
 │
 └── ejercicio1/              # Módulo 3
      ├── pom.xml
      └── src/main/java/com/github/andres/ejercicio1/
           ├── Main.java
           └── models/
                ├── CuentaBancaria.java
                └── ...


Cada módulo incluye:
- `src/main/java` con las clases (`Main.java`, `models/`, etc.)
- Configuración de `exec-maven-plugin` para ejecutar la clase principal.


## Cómo instalar el proyecto =
Desde el directorio raíz:

Si Unix: `$ ./mvnw clean install`
Windows: `$ ./mvnw.cmd clean install`

## Cómo ejecutar un módulo 
`$ cd nombremodulo`
`$ ../mvnw exec:java`

