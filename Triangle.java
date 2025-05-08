
public class Triangle implements Figuras {
    private double side1, side2, side3, base, height;

    public Triangle(double side1, double side2, double side3, double base, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return (base * height) / 2;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
