
public class Rhombus implements Figuras {
    private double side, majorDiagonal, minorDiagonal;

    public Rhombus(double side, double majorDiagonal, double minorDiagonal) {
        this.side = side;
        this.majorDiagonal = majorDiagonal;
        this.minorDiagonal = minorDiagonal;
    }

    public double calculateArea() {
        return (majorDiagonal * minorDiagonal) / 2;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}

