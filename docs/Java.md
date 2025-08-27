requires all functions to be defined in a class

zero or more parameters on method.
must be explicitly typed  - no type inference for parameters
just as the return type.

a public access modifier must be used to allow a method to be called

```java
class Calculator {
    public int add(int x, int y) {
        return x + y;
    }
}

int sum = new Calculator().add(1,2);
```
