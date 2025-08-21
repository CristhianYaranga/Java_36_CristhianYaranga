package Valle.edu.pe;

public class Calculadora {
    // Atributos
    private double numero1;
    private double numero2;

    // Método constructor
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Métodos con valor de retorno (usan atributos de la clase)
    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return numero1 / numero2;
    }

    // Métodos con parámetros
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }
}

