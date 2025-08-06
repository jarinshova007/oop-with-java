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
class EquilateralTriangle extends Triangle {
    @Override
    public void area(int l, int h) {
        super.area(l, h); // from super class
        System.out.println(0.5 * l * h);
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        EquilateralTriangle abc = new EquilateralTriangle();
        abc.area(); // from grandparent class
        abc.area(10, 5); // from EquilateralTriangle class

        Triangle ab = new Triangle();
        ab.area(); // from parent class
        ab.area(10, 5); // from Triangle class
    }
}