package Calculadora;

public class Calculadora {

    private int primerNumero;
    private int segundoNumero;
    private Calculadora calc;

    public Calculadora(int primerNumero, int segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public int suma() {
        int resultado = primerNumero + segundoNumero;
        return resultado;
    }

    public int resta() {
        // Metodo CORREGIDO
        int resultado = primerNumero - segundoNumero;
        return resultado;
    }

    public int multiplica() {
        int resultado = primerNumero * segundoNumero;
        return resultado;
    }

    public int divide() {
        // Metodo CORREGIDO
        if (segundoNumero == 0) {
            throw new ArithmeticException("Division por 0");
        }

        int resultado = primerNumero / segundoNumero;
        return resultado;
    }
}


