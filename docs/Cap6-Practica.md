del paquete `java.security`, del objeto de la clase `SecureRandom` :
queremos producir **números aleatorios no determinísticos** que *no pueden* predecirse

generalización del escalamiento y desplazamiento de números aleatorios

`int numero = valorDesplazamiento + numerosAleatorios.nextInt(factorEscala)`

`valorDesplazamiento` primer número del rango deseado de enteros consecutivos
`factorEscala` cuántos números hay en el rango

`Random` tiene mucho mejor rendimiento pero compromete la seguridad.



---

Introducción a los tipos `enum`

TO-DO: analizar mejor el Craps
donde
`private enum Estado {CONTINUA, GANO, PERDIO}`

