package uml3;
import java.util.List;
import java.util.ArrayList;

class University {
    String name;
    List<Department> disciplines;

    University(String name) {
        this.name = name;
        this.disciplines = new ArrayList<>();
    }

    void addDept(Department department) {
        disciplines.add(department);
    }

    void displayUniversity() {
        System.out.println(name);
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("Student Details:");
        System.out.println();
        for (Department d : disciplines) {
            d.displayDepartment();
        }
    }
}
