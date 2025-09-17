package uml3;
import java.util.List;
import java.util.ArrayList;

public class Department {
    String deptName;
    List<Student> students;

    Department(String deptName) {
        this.deptName = deptName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void displayDepartment() {
        System.out.println("  --- " + deptName + " " + "Department ---");
        for (Student s : students) {
            s.displayStudent();
        }
        System.out.println("----------------------------");
    }
}
