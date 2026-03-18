# Pruebas Unitarias con JUnit – Calculadora

## Descripción

En esta práctica se han realizado pruebas unitarias en Java utilizando JUnit sobre una clase llamada `Calculadora`.
El objetivo principal ha sido comprobar el correcto funcionamiento de sus métodos y detectar errores mediante tests automatizados.

---

## Estructura del proyecto

* `Calculadora.java` → Clase principal con las operaciones
* `CalculadoraJRTest.java` → Clase de pruebas unitarias
* `OtraClaseDePruebasTest.java` → Clase adicional de prueba
* `SuitePruebasAB.java` → Suite de pruebas

---

## Funcionalidades probadas

La clase `Calculadora` incluye los siguientes métodos:

* `suma()`
* `resta()`
* `multiplica()`
* `divide()`

Se han realizado pruebas unitarias para todos ellos.

---

## Pruebas realizadas

### Tests básicos

Se ha creado un método de prueba por cada método de la clase:

* `testSuma()`
* `testResta()`
* `testMultiplica()`
* `testDivide()`

Inicialmente, los métodos `resta()` y `divide()` contenían errores que fueron detectados mediante los tests.

---

### Detección y corrección de errores

Gracias a JUnit se detectaron errores en:

* `resta()` → realizaba una suma en lugar de una resta
* `divide()` → realizaba una suma en lugar de una división

Estos errores fueron corregidos posteriormente.

---

### Manejo de excepciones

Se modificó el método `divide()` para que lance una excepción cuando se intente dividir entre 0.

Se creó el test:

* `testDivideExcepcion()`

Este test comprueba que se lanza correctamente una `ArithmeticException`.

---

### Inicialización con @BeforeEach y @AfterEach

Se utilizó:

* `@BeforeEach` → para crear el objeto `Calculadora`
* `@AfterEach` → para limpiar el objeto

Esto evita repetir código en cada test.

---

### Tests parametrizados

Se utilizaron:

* `@ValueSource` → para pruebas con un solo parámetro
* `@CsvSource` → para pruebas con varios valores

Esto permite probar múltiples casos sin repetir código.

---

### Suite de pruebas

Se creó una suite de pruebas:

* `SuitePruebasAB`

Permite ejecutar todas las pruebas del proyecto en un solo paso.

---

# Reflexión personal

Las pruebas unitarias me parecen una herramienta muy útil dentro del desarrollo de software. Permiten comprobar que cada parte del programa funciona correctamente de forma independiente.

Creo que ayudan mucho a mejorar la calidad del código, ya que permiten detectar errores rápidamente antes de que el programa esté terminado. Además, facilitan hacer cambios en el código sin miedo a romper algo que ya funcionaba.

También considero que son importantes para trabajar en equipo, porque otros desarrolladores pueden entender mejor el código y comprobar su funcionamiento fácilmente.

En general, pienso que las pruebas unitarias son una parte fundamental del desarrollo moderno.

---

# Testing Pyramid

## ¿Qué es la Testing Pyramid?

La Testing Pyramid (Pirámide de testing) es un modelo que representa los diferentes tipos de pruebas en un proyecto de software y cómo deben distribuirse.

---

## Tipos de pruebas

La pirámide se divide en tres niveles:

### Base → Pruebas unitarias

* Prueban métodos o clases individuales
* Son rápidas y fáciles de ejecutar
* Son las más numerosas

### Medio → Pruebas de integración

* Comprueban cómo interactúan diferentes partes del sistema

### Cima → Pruebas end-to-end

* Simulan el comportamiento real del usuario
* Son más lentas y complejas

---

## ¿Por qué las unitarias están en la base?

Las pruebas unitarias están en la base porque:

* Son rápidas de ejecutar
* Son fáciles de escribir
* Permiten detectar errores desde el principio
* Se pueden hacer muchas pruebas sin mucho coste

Por eso, en un proyecto real, la mayoría de las pruebas suelen ser unitarias.

---

# Conclusión

Gracias a esta práctica se ha aprendido a:

* Crear tests con JUnit
* Detectar errores en el código
* Manejar excepciones
* Usar tests parametrizados
* Agrupar pruebas con una suite

Las pruebas unitarias son una herramienta clave para desarrollar software de calidad.
