package uml3;
/*
+----------------+        +----------------+        +----------------+
|   University   |<>------|   Department   |<>------|    Student     |
+----------------+        +----------------+        +----------------+
| - name:String  |        | - deptName:String|      | - id:int       |
| - dept:List    |        | - students:List |       | - name:String  |
+----------------+        +----------------+        +----------------+                            
 */

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(23, "Jarin");
        Student s2 = new Student(24, "Sunerah");
        Student s3 = new Student(12, "Shraboni");
        Student s4 = new Student(13, "Labonno");
        Student s5 = new Student(15, "Tasnim");

        Department d1 = new Department("CSE");
        Department d2 = new Department("Civil");
        Department d3 = new Department("EEE");

        d1.addStudent(s1);
        d1.addStudent(s2);
        d2.addStudent(s3);
        d2.addStudent(s4);
        d3.addStudent(s5);

        University varsity = new University("Pundra University of Science and Technology");
        
        varsity.addDept(d1);
        varsity.addDept(d2);
        varsity.addDept(d3);

        varsity.displayUniversity();

    }
}
