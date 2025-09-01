1 método - 1 tarea - 1 nombre que lo exprese efectivamente, si no se puede eso; dividir en más
clases relacionadas agrupadas en *paquetes*

aprender a navegar la [API de Java](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)

---
Hay una *relación jerárquica entre llamadas a métodos*

no siempre es necesario llamar al método en objetos específicos si tiene la keyword `static`, es conocido como **método de clase**

por ejemplo, con `Math`, podemos llamar sus métodos sin crear un objeto de `Math`
para corroborar lo que decía la lectura, donde, según, todos los métodos de la clase `Math` son `static`, lo que hice fue lo siguiente, busqué "java 21 api documentation" en DuckDuckGo, luego clickee en `java.base`, (Module), luego en `java.lang` (Package), y bajo "All Classes and Interfaces" clickee en `Math`y bajo Method Summary, verdaderamente, **todos son static**

normalmente, cada objeto de una clase mantiene su *propia* copia de cada variable de instancia de la clase. Hay variables para las que cada objeto *no* necesita su propia copia independiente.
Esas son las variables `static`, conocidas como **variables de clase**

los objetos de una clase con variables `static`, todos los objetos de esa clase comparten `una` copia de esas variables.

las constantes de la clase `Math` llevan los tres mods, `public, final, static`
lo nuevo es `final`, cualquier campo declarado con esta palabra clave es *constante*, porque **su valor no puede modificares después de inicializar el campo**

---

¿Por qué el método  `main` se declara como `static`?

por el comando `java`, que ejecuta la JVM, se especifica el nombre de la Clase como un argumento para el comando y para que éste invoque al método main.

despues de dicho `NombreClase`, es una lista de objetos `String` como argumento, estos so npara especificar opciones.

---

el `+` : **concatenación de objetos String**
permite hacerlo, no solo con Strings, dado que: 
*Cada valor primitivo y cada objeto en Java tienen una representación String*

Cuando uno de los operandos es un objeto `String`, el otro se convierte en string y después se *concatenan* los dos.
con los `double` los ceros a la derecha se descartan.

Esto es dado que *todos los objetos tienen un método toString* al cual se le hace una llamada implícita cada que. También puede ser explícita

con esto, es más recomendable dividir una literal `String` grande en varios objetos `String` más pequeños y concatenar para formar la literal `String` deseada, en vez de dividir la literal `String` en varias líneas.

---

métodos static - relación a la clase como un todo 

métodos de instancia - con instancia específica (objeto) - pueden manipular las variables de instancia de dicho objeto

por ello, un método `static` no tiene manera de saber qué variables de instancia manipular de cuál objeto 

---

[Pila-Llamadas-Marcos-Pila](Pila-Llamadas-Marcos-Pila.md)

---
Promoción y conversión de argumentos

convertir el *valor de un argumento* al tipo que espera recibir en su respectivo *parámetro*

hay **reglas de promoción** - es esto casting?

conversiones posibles *sin perder datos* 
en algunos casos lo podemos hacer explícito con un *operador de conversión*, tomamos control del compilador. 

---
paquetes
creo que `java.sql` el **Paquete JDBC**

---
Práctica:
[Cap6-Practica](Cap6-Practica.md)
también incluye el juego Craps

---

Alcance de las declaraciones

también ámbito - porción de programa que puede hacer referencia a la entidad declarada por su nombre.

alcance de declaración de parámetro: el cuerpo del método en el que aparece

"" variable local, desde el punto en el que aparece la declaración, hasta el fin de ese bloque. 

"" variable local en la sección de inicialización de un `for`, es el cuerpo de dicho `for` y las expresiones en el mismo encabezado de inicialización

alcance de un método o campo, es el cuerpo de la clase. 


ocultación de variables (shadowing)

si una variable local o parámetro en un método, tiene el mismo nombre que un campo de la clase,
el campo es *ocultado* hasta que el bloque termina su ejecución
	si es una variable de instancia el campo, colocar `this.x`
	si es una variable de clase `static`, colocar `NombreClase.x`

---

sobrecarga de métodos


es posible tener métodos con el *mismo* nombre en la misma clase,
siempre y cuando tengan *distintos* conjuntos de parámetros (número, tipo, orden)

cuando se llama un método sobrecargado - el compilador selecciona el apropiado analizando el número, tipo, y orden de los argumentos en la llamada 

yendo de vuelta al ejemplo, `min` y `max` de Math tienen sobrecargas para 4 versiones de ada uno
dos doubles,
dos float,
dos int,
dos long,

también existen, constructores sobrecargados.  (cap8)

al final y al cabo, la diferencia se hace con base en su **firma** 
que considera el número, tipo y orden de parámetros, pero *no* el tipo del valor de retorno.

error común: declarar métodos sobrecargados con listas de parámetros idénticas es un error de compilación, sin importar que los tipos de valores de retorno sean distintos 