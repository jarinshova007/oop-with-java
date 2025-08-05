class Student {
    String name;
    int age;

    public void displayInfo(String name) {
        System.out.println("Students Name: " + this.name);
    }
    public void displayInfo(int age) {
        System.out.println("Students Age: " + this.age);
    }
    public void displayInfo(String name, int age) {
        System.out.println("Students Name: " + this.name);
        System.out.println("Students Age: " + this.age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Jarin";
        s1.age = 21;
        s1.displayInfo(s1.age);
        s1.displayInfo(s1.name, s1.age);
    }    
}
