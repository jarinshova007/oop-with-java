package uml5;

public class Patient {
    int id;
    String name;
    String disease;

    Patient(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    void displayPatient() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Disease: " + disease);
    }
}
