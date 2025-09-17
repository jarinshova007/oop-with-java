package uml6;
// there are some basic things in this package

/*
+----------------+          +----------------+        +----------------+
|    Company     |<>--------|   Employee     |<>------|    Project     |
+----------------+          +----------------+        +----------------+
| - name:String  |          | - empId:int    |        | - projectId:int|
| - employees:List|         | - empName:String|       | - projectName  |
+----------------+          | - project:Proj |        +----------------+
                            +----------------+                   
 */

public class Main {
    public static void main(String[] args) {
        Project p1 = new Project(1, "Project 1"); // for e1 (remove)
        Project p2 = new Project(2, "Project 2"); // for e1 
        Project p3 = new Project(3, "Project 3"); // for e2
        Project p4 = new Project(4, "Project 4"); // for e2 (remove)
        Project p5 = new Project(5, "Project 5"); // for e3 , e4

        Employee e1 = new Employee(1, "Alexy");
        Employee e2 = new Employee(2, "Sonia");
        Employee e3 = new Employee(3, "Sympkin");
        Employee e4 = new Employee(4, "Tartiana");
        
        // add project
        e1.addProject(p1);
        e1.addProject(p2);
        e2.addProject(p3);
        e2.addProject(p4);
        e3.addProject(p5);
        e4.addProject(p5);

        // remove project
        e1.removeProject(p1);

        Company company = new Company();
        company.setCompanyInfo("Macrosoft");

        // add employee
        company.addEmployee(e1);
        company.addEmployee(e2);
        company.addEmployee(e3);
        company.addEmployee(e4);

        // remove employee
        company.removeEmployee(e3);

        company.displayCompany();
    }
}
