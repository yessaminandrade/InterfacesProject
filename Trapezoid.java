
public class Trapezoid implements Figuras {
    private double side1, side2, base1, base2, height;

    public Trapezoid(double side1, double side2, double base1, double base2, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double calculateArea() {
        return ((base1 + base2) * height) / 2;
    }

    public double calculatePerimeter() {
        return side1 + side2 + base1 + base2;
    }
}
