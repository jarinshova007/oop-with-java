// parent class of Triange and Circle (hierarchical ~ Triangle and Circle)
class Shape { 
    public void area() {
        System.out.println("Displays area");
    }
}
// child class of Shape (hierarchical ~ Shape)
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}
// child class of Shape (hierarchical ~ Shape)
// parent class of _Circle (single level ~ _Circle)
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}
// child of circle (single level ~ Circle)
class _Circle extends Circle {
    public void perimeter(int r) {
        System.out.printf("%.2f\n", 2 * (3.14) * r); // for two digit after decimal point
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Triangle a = new Triangle();
        a.area();
        a.area(10, 6);

        Circle b = new Circle();
        b.area();
        b.area(10);

        _Circle c = new _Circle();
        c.area(); // from grandparent class Shape
        c.area(10); // from parent class
        c.perimeter(10);
    }
}
