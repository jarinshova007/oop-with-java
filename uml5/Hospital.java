package uml5;
import java.util.List;
import java.util.ArrayList;

public class Hospital {
    String name;
    List<Doctor> doctors;
    List<Patient> patients;

    Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void displayHospital() {
        System.out.println(name);
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println();
        System.out.println("# Doctor Details:");
        System.out.println();
        for(Doctor d : doctors) {
            d.displayDoctor();
            System.out.println("----------------------");
        }
        System.out.println("----------------------");

        System.out.println();
        System.out.println("# Patient Details:");
        System.out.println();
        for(Patient p : patients) {
            p.displayPatient();
            System.out.println("----------------------");
        }
        System.out.println("----------------------");
    }
}
