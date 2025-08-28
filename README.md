# Asignatura: METODOLOGIA Y PROGRAMACION ORIENTADA A OBJETOS I 

Este repositorio contiene ejercicios de programación orientada a objetos organizados como un proyecto **multi-módulo de Maven**.  
Cada capítulo o actividad está separado en su propio módulo independiente.

El wrapper de Maven está para garantizar compatibilidad y reproducibilidad.
Usa el OpenJDK 17.0.6 de MS y Maven 3.9.6

## Cómo instalar el proyecto 
Desde el directorio raíz `intellij-poo`:

Si Unix: `$ ./mvnw clean install`
Windows: `$ ./mvnw.cmd clean install`

## Estructura:

Cada módulo incluye:
- `src/main/java` con las clases (`Main.java`, `models/`, etc.)
- Su propio `pom.xml` con [Exec Maven Plugin](https://www.mojohaus.org/exec-maven-plugin/) configurado para correr Main con el mismo SDK que el proyecto raíz.

## Cómo ejecutar un módulo 
`$ cd nombremodulo`
`$ ../mvnw exec:java`

