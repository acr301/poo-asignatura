Usando `nvim` con el plugin-manager `lazy`, y tomando ventaja de su soporte para LSP, usamos un eclipse "decapitado", con `nvim-jdtls`. 

Consideraciones para compatibilidad: Requiere un SDK +21, pero, se puede cambiar el runtime para que sea targeted a una version ?

Inspirado de [Cómo programo Java sin IDE y cómo puedes hacerlo tú](https://youtu.be/9HqgUo7kduk?si=TT_KtfWGVTSFWRum&t=754)
Y este [Neovim Starter Kit for Java](https://github.com/bcampolo/nvim-starter-kit/tree/java#neovim-starter-kit-for-java-) del que agarré casi toda la configuración como si fuera el mero IntelliJ, ya muy bien preconfigurado y documentado. 



el software development kit manager `sdkman`


`curl -s "https://get.sdkman.io" | bash`
`sdk list java | grep 17`

```
$ curl -s "https://get.sdkman.io" | bash
$ sdk list java | grep 17
```

me lleva a ver `17.0.16` vendor `ms`

`$ sdk install java 17.0.16-ms`

cuando me pide que si lo quiero set como default le pongo que si.
luego, para el Build System, `$ sdk install maven`
(la última versión por default)

y efectivamente tenemos
```
$ sdk current
Current versions in use:
java 17.0.16-ms
maven 3.9.10
```

el crear un proyecto en IntelliJ abstrae `$ mvn archetype:generate`

por mi lado, como solo iban  a ser dos clases, pensaba crear directorio `~/POO/creacion_proyecto`
y luego el resto de directorios necesarios con `mkdir -p`, y un un `pom.xml` básico, pero qué mejor oportunidad para entender bien mi build tool, creando mi propio arquetipo. Me ayudo de los docs de Maven [Guide to Creating Archetypes](https://maven.apache.org/guides/mini/guide-creating-archetypes.html)

O creo que mejor usamos un bundle ya existente [Maven Archetype Bundles](https://maven.apache.org/archetypes/index.html)
Y el que más se parece es el Maven Simple Project Archetype

```
$ mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-simple -DarchetypeVersion=1.5

project
|-- .mvn
|   |-- jvm.config
|   `-- maven.config
|-- pom.xml
`-- src
    |-- main
    |   `-- java
    |       `-- $package
    |           `-- App.java
    |-- site
    |   `-- site.xml
    `-- test
        `-- java
            `-- $package
                `-- AppTest.java
```
