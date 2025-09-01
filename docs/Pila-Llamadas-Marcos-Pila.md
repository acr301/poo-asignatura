`LIFO`

cuando se llama un método - dicho método debe saber cómo regresar al que lo llamó
por lo que la *dirección de retorno* del método que hizo la llamada se *mete* en la **pila de llamadas a métodos**

aquí también se contiene la memoria para las *variables locales*, incluyendo los parámetros de los métodos utilizados en cada invocación. estos datos son el **marco de pila** (o **registro de activación**) de la llamada de un método

llamada a un método > marco de pila para la llamada de ese método se *mete* en la pila de llamada de métodos > método regresa al que lo llamó > marco de pila para esa llamada al método se *saca* y se desconocen las variables locales.

un objeto se puede volver inaccessible de esa manera - dado que se saque de la pila el marco de pila que contiene la variable local que referencie a ese objeto, ya que la JVM lo eliminará durante la `recolección de basura`

cuando hay más llamadas a los métodos de las almacenables en su marco de pila, tenemos un **desbordamiento de pila** 

