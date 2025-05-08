
public class Cuadrado implements Figuras {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calculateArea() {
        return lado * lado;
    }

    public double calculatePerimeter() {
        return 4 * lado;
    }
}

