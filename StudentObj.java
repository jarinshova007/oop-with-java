class Student {
    String name;
    int age;

    public void printName() {
        System.out.println("Students name: " + this.name);
    }

    public void printAge() {
        System.out.println("Students age: " + this.age);
    }
}
public class StudentObj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jarin";
        s1.age = 21;
        s1.printName();
        s1.printAge();

        Student s2 = new Student();
        s2.name = "Shova";
        s2.age = 22;
        s2.printName();
        s2.printAge();
    }
}

