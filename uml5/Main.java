package uml5;
/*
+----------------+        +----------------+        
|   Hospital     |<>------|    Doctor      |
+----------------+        +----------------+
| - name:String  |        | - id:int       |
| - doctors:List |        | - name:String  |
| - patients:List|        | - specialization:String |
+----------------+        +----------------+
            |                 
            |<>--------------+----------------+
                            |    Patient      |
                            +----------------+
                            | - id:int       |
                            | - name:String  |
                            | - disease:String|
                            +----------------+
 */

public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(1, "Dr. Sabik Khan", "Psychiatrist");
        Doctor d2 = new Doctor(2, "Dr. Tasin Khan", "Cardiologist");

        Patient p1 = new Patient(1, "Patient1", "Disease1");
        Patient p2 = new Patient(2, "Patient2", "Disease2");

        Hospital hospital = new Hospital("Mohammmad Ali Hospital");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.displayHospital();

    }
}
