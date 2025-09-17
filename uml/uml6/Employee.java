package uml6;
import java.util.List;
import java.util.ArrayList;

class Employee {
    private int empId;
    private String empName;
    private List<Project> projects;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        this.projects = new ArrayList<>();
    }
    /*  getters
    int getEmpId() {
        return empId;
    }
    String getEmpName() {
        return empName;
    }
    List<Project> getProjects() {
        return projects;
    }
    // setters
    void setInfo(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        // no need to modify project here rather use add and remove method
    } */

   // add project
    void addProject(Project project) {
        projects.add(project);
    }

    // remove project
    void removeProject(Project project) {
        projects.remove(project);
    }

    void displayEmployee() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        for (Project p : projects) {
            p.displayProject();
        }
    }
}
