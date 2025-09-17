package uml5;

public class Doctor {
    int id;
    String name;
    String specialization;

    Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}
