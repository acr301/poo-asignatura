todas las funciones son definidas en una clase.
se le llama método, puede tener cero o más parámetros

explícitamente tipado - para los parámetros y el return

se necesita el modificador de acceso público, para poder llamar al método desde fuera de la clase.



```java
class Calculator {
    public int add(int x, int y) {
        return x + y;
    }
}

int sum = new Calculator().add(1,2);
```

`javac *.java` -> `.class` bytecode para JVM que lo interpreta al ejecutar el programa con `java ClaseControladora` (aquella que lleve el `psvm`)