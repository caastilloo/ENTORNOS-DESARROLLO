package Calculadora;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        CalculadoraTest.class,
        OtraClaseDePruebasTest.class
})
public class SuitePruebasJR {
}