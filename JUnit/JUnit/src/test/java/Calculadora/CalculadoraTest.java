package Calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void inicio() {
        calculadora = new Calculadora(30, 10);
    }

    @AfterEach
    public void fin() {
        calculadora = null;
    }

    @Test
    public void testSuma() {
        int esperado = 40;
        int obtenido = calculadora.suma();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testResta() {
        int esperado = 20;
        int obtenido = calculadora.resta();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testMultiplica() {
        int esperado = 300;
        int obtenido = calculadora.multiplica();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testDivide() {
        int esperado = 3;
        int obtenido = calculadora.divide();
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testDivideExcepcion() {
        calculadora = new Calculadora(30, 0);

        String esperado = "Division por 0";
        String obtenido = "";

        try {
            calculadora.divide();
            fail();
        } catch (ArithmeticException e) {
            obtenido = e.getMessage();
        }

        assertEquals(esperado, obtenido);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "4, 5, 9",
            "10, 0, 10"
    })
    public void testSumaCsv(int a, int b, int esperado) {
        Calculadora calc = new Calculadora(a, b);

        int obtenido = calc.suma();

        assertEquals(esperado, obtenido);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 3, 2",
            "10, 4, 6",
            "8, 2, 6"
    })
    public void testRestaCsv(int a, int b, int esperado) {
        Calculadora calc = new Calculadora(a, b);

        int obtenido = calc.resta();

        assertEquals(esperado, obtenido);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 6",
            "4, 5, 20",
            "6, 0, 0"
    })
    public void testMultiplicaCsv(int a, int b, int esperado) {
        Calculadora calc = new Calculadora(a, b);

        int obtenido = calc.multiplica();

        assertEquals(esperado, obtenido);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "20, 4, 5",
            "30, 10, 3"
    })
    public void testDivideCsv(int a, int b, int esperado) {
        Calculadora calc = new Calculadora(a, b);

        int obtenido = calc.divide();

        assertEquals(esperado, obtenido);
    }
}