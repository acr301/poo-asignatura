Usando `nvim` con el plugin-manager `lazy`, y tomando ventaja de su soporte para LSP, usamos un eclipse "decapitado", con `nvim-jdtls`. 

Consideraciones para compatibilidad: Requiere un SDK +21, pero, se puede cambiar el runtime para que sea targeted a una version ?

Inspirado de [Cómo programo Java sin IDE y cómo puedes hacerlo tú](https://youtu.be/9HqgUo7kduk?si=TT_KtfWGVTSFWRum&t=754)
Y este [Neovim Starter Kit for Java](https://github.com/bcampolo/nvim-starter-kit/tree/java#neovim-starter-kit-for-java-) del que agarré casi toda la configuración como si fuera el mero IntelliJ, ya muy bien preconfigurado y documentado. 


el software development kit manager `sdkman`


`curl -s "https://get.sdkman.io" | bash`
`sdk list java | grep 21`

```
$ curl -s "https://get.sdkman.io" | bash
$ sdk list java | grep 21
```

me lleva a ver `21.0.8` vendor `tem`
también está el vendor `jbr` - JetBrains, pero solo es como un empaquetado para el soporte corporativo. 

`$ sdk install java 21.0.8-tem`

cuando me pide que si lo quiero set como default le pongo que si.
luego, para el Build System, `$ sdk install maven`
(la última versión por default)

y efectivamente tenemos
```
$ sdk current
Current versions in use:
java 21.0.8-tem
maven 3.9.10
```

