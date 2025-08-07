// parent class
class Shape { 
    public void area() {
        System.out.println("Displays area");
    }
}
// child class of Shape
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}
// child class of Shape
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}
class HierarchicalInheritance {
    public static void main(String[] args) {
    
        Triangle a = new Triangle();
        a.area();
        a.area(10, 6);

        Circle b = new Circle();
        b.area();
        b.area(10);
    }
}
