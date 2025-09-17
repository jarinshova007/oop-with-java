package uml6;
import java.util.List;
import java.util.ArrayList;

class Company {
    private String name;
    private List<Employee> employees;

    void setCompanyInfo(String name) {
        this.name = name;
        // it is required for setter only, not for constructor
        if (this.employees == null) {
            this.employees = new ArrayList<>();
        }
    }

    void addEmployee(Employee employee) {
        employees.add(employee);
    }
    void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    void displayCompany() {
        System.out.println(name);
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("Employee Details:");
        System.out.println();
        for (Employee e : employees) {
            e.displayEmployee();
            System.out.println("-------------------");
        }
        System.out.println("-------------------");
    }
}
