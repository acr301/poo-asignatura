# Asignatura: METODOLOGIA Y PROGRAMACION ORIENTADA A OBJETOS I 

Este repositorio contiene ejercicios de programación orientada a objetos organizados como un proyecto **multi-módulo de Maven**.  
Cada capítulo o actividad está separado en su propio módulo independiente.

El wrapper de Maven está instalado para garantizar compatibilidad y reproducibilidad.
Usamos el OpenJDK 17.0.6 de MS. 
Cada módulo que deberá llevar una clase main ejecutable tiene su propio `pom.xml` configurado con el plugin [Exec Maven Plugin](https://www.mojohaus.org/exec-maven-plugin/) 

En el ámbito de IntelliJ + Maven entiéndase lo siguiente:
Project > Module > (donde el source) Package y el Main > Models 

## Cómo instalar el proyecto 
Desde el directorio raíz:

Si Unix: `$ ./mvnw clean install`
Windows: `$ ./mvnw.cmd clean install`

## Estructura:

Cada módulo incluye:
- `src/main/java` con las clases (`Main.java`, `models/`, etc.)
- Cada módulo que deberá llevar una clase main ejecutable tiene su propio `pom.xml` configurado con el plugin [Exec Maven Plugin](https://www.mojohaus.org/exec-maven-plugin/) 

En el ámbito de IntelliJ + Maven entiéndase lo siguiente:
## Cómo ejecutar un módulo 
`$ cd nombremodulo`
`$ ../mvnw exec:java`

