package uml12;

public class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double area = 3.1416 * radius * radius;
        return area;
    }
}
