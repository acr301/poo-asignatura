todas las funciones son definidas en una clase.
se le llama método, puede tener cero o más parámetros

explícitamente tipado - para los parámetros y el return

se necesita el modificador de acceso público, para poder llamar al método desde fuera de la clase.
ver: [Pila-Llamadas-Marcos-Pila](Pila-Llamadas-Marcos-Pila.md)



```java
class Calculator {
    public int add(int x, int y) {
        return x + y;
    }
}

int sum = new Calculator().add(1,2);
```

`javac *.java` -> `.class` bytecode para JVM que lo interpreta al ejecutar el programa con `java ClaseControladora` (aquella que lleve el `psvm`)

---
Un método static es especial, ya que puede llamarse sin tener que crear primero un objeto de la clase en la cual se declara ese método.

Los parámetros de un método son variables locales.

---


| Tipos primitivos                                                                                 | Tipos (no primitivos) por referencia                                                                                                                                                                              |
| ------------------------------------------------------------------------------------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| una variable de tipo primitivo, puede almacenar sólo *un* valor de su tipo declarado             | se usan para almacenar *direcciones* de los objetos en memoria - las variables de estos tipos **hacen referencia a un objeto**. dichos objetos que ser referencian  pueden tener *muchas* variables de instancia. |
| variables de instancia se *inicializan* de manera predeterminada. por ejemplo con `0` , `false`. | si no se inicializan de manera *explícita*, lo hacen de manera predeterminada con el valor `null` - *referencia a nada*.                                                                                          |
| las variables de estos tipos no pueden usarse para llamar métodos                                | estas variables sí pueden ser usadas para llamar un método.                                                                                                                                                       |


String: ¿Es de referencia?

---
Inicialización de objetos mediante constructores

su nombre es el nombre de la clase - se le pasa la variable de instancia con la que queramos inicializar de manera personalizada el objeto, como parámetro.

se requiere una llamada al constructor para *cada* objeto que se cree.

palabra clave `new` para solicitar memoria de sistema para almacenar el objeto - y luego se llama al constructor. la expresión de creación de la instancia de clase devuelve una *referencia* a ese nuevo objeto, cada objeto mantendrá su *propia copia* de las variables de instancias con las que se inicialice.

ojo: los constructores *no pueden devolver valores* - no se les puede especificar un tipo de valor de retorno, ni siquiera `void` - generalmente se declaran como `public` aunque se pueden usar `private` ==¿Cuándo?==

Las clases pueden tener varios constructores.

El único caso donde prescindimos de constructores, es donde la inicialización predeterminada, como `Clase miInstancia = new Clase()` 

En UML, `<<constructor>>`. En el mismo compartimiento que los métodos. 

las variables *locales* no se inicializan de manera predeterminada. deben inicializarse de manera *explícita*

---
Primitivos para punto flotante

`float` : precisión simple - hasta 7 dígitos significativos
`double`: precisión doble - requieren el *doble* de memoria, hasta 15 dígitos significativos.
para mostrarlos, `printf` con el especificador de formato `%.2f` donde el `.2` es el número de lugares decimales a imprimirse a la derecha del punto decimal - con `%.2f` *se redondeará* a la posición de centenas 