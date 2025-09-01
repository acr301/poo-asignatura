https://www.openxava.org/doc/
https://www.openxava.org/OpenXavaDoc/docs/index_es.html 

---
creamos nuestra entidad as per JPA en `model/nombreEntidad.java`
a la clase le ponemos las  anotaciones, `@Entity` y `@Getter @Setter`

vease como tira el error de que tiene que tener una primary key 

la `length` de columna se usa al nivel de UI y DB. 2

el `@Required` es para que  tire un error de validación si  se deja en blanco

---
luego corremos todo con 
`mvn compile`

```
java -cp "target/demoOpenXava/WEB-INF/classes;target/invoicing/WEB-INF/lib/*" com.acr301.github.demoOpenXava.run.demoOpenXava
```
