package HMS;

import java.util.*;

// Patient class to store patient details
class Patient {
    int id;
    String name;
    int age;
    String disease;

    public Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Age: " + age + ", Disease: " + disease;
    }
}

// Doctor class to store doctor details
class Doctor {
    int id;
    String name;
    String specialization;

    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor ID: " + id + ", Name: " + name + ", Specialization: " + specialization;
    }
}

// Hospital Management System
public class BasicHMS {
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Disease: ");
        String disease = scanner.nextLine();
        patients.add(new Patient(id, name, age, disease));
        System.out.println("Patient added successfully!");
    }

    public void addDoctor() {
        System.out.print("Enter Doctor ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = scanner.nextLine();
        doctors.add(new Doctor(id, name, specialization));
        System.out.println("Doctor added successfully!");
    }

    public void listPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            patients.forEach(System.out::println);
        }
    }

    public void listDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            doctors.forEach(System.out::println);
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. List Patients");
            System.out.println("4. List Doctors");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addPatient();
                case 2 -> addDoctor();
                case 3 -> listPatients();
                case 4 -> listDoctors();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        BasicHMS hms = new BasicHMS();
        hms.menu();
    }
}
