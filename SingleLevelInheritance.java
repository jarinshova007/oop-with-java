class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Triangle x = new Triangle();
        x.area();
        x.area(10, 6);
    }
}