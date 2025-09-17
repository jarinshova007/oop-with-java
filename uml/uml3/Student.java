package uml3;

public class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Student Id: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("---------------------------");
    }
}
