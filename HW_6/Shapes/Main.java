package HW_6.Shapes;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5.0),
                new Triangle(6.0, 4.0),
                new Square(3.0)
        };

        double totalArea = getTotalArea(shapes);
        System.out.println("Total area of all shapes: " + totalArea);
    }

    public static double getTotalArea(Shape[] shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
