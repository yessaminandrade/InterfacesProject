
public class Main {
    public static void main(String[] args) {
        // Create objects for each shape
        Figuras square = new Cuadrado(5);
        Figuras triangle = new Triangle(3, 4, 5, 3, 4);
        Figuras rectangle = new Rectangle(6, 3);
        Figuras rhombus = new Rhombus(4, 6, 5);
        Figuras rhomboid = new Rhomboid(5, 4);
        Figuras trapezoid = new Trapezoid(3, 3, 6, 4, 4);

        // Store all shapes in an array
        Figuras[] shapes = {square, triangle, rectangle, rhombus, rhomboid, trapezoid};

        // Print results
        for (Figuras shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("-----------------------------");
        }
    }
}
