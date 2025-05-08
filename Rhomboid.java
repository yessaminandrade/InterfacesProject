
public class Rhomboid implements Figuras {
    private double base, height;

    public Rhomboid(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return base * height;
    }

    public double calculatePerimeter() {
        return 2 * (base + height);
    }
}

