package HMS;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class HospitalManagementGUI extends JFrame {
    private PatientDAO patientDAO;
    private DoctorDAO doctorDAO;
    private RoomDAO roomDAO;

    public HospitalManagementGUI() {
        patientDAO = new PatientDAO();
        doctorDAO = new DoctorDAO();
        roomDAO = new RoomDAO();

        setTitle("Hospital Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        JButton addPatientButton = new JButton("Add Patient");
        JButton addDoctorButton = new JButton("Add Doctor");
        JButton listPatientsButton = new JButton("List Patients");
        JButton listDoctorsButton = new JButton("List Doctors");
        JButton availableRoomsButton = new JButton("View Available Rooms");
        JButton assignRoomButton = new JButton("Assign Room");
        JButton assignedRoomsButton = new JButton("View Assigned Rooms");
        JButton quitButton = new JButton("Quit");

        addPatientButton.addActionListener(e -> addPatientDialog());
        addDoctorButton.addActionListener(e -> addDoctorDialog());
        listPatientsButton.addActionListener(e -> showPatients());
        listDoctorsButton.addActionListener(e -> showDoctors());
        availableRoomsButton.addActionListener(e -> showAvailableRooms());
        assignRoomButton.addActionListener(e -> assignRoomDialog());
        assignedRoomsButton.addActionListener(e -> showAssignedRooms());
        quitButton.addActionListener(e -> System.exit(0)); // Quit application

        add(addPatientButton);
        add(addDoctorButton);
        add(listPatientsButton);
        add(listDoctorsButton);
        add(availableRoomsButton);
        add(assignRoomButton);
        add(assignedRoomsButton);
        add(quitButton);
    }

    private void addPatientDialog() {
        JTextField nameField = new JTextField();
        JTextField ageField = new JTextField();
        JTextField diseaseField = new JTextField();

        Object[] message = {"Name:", nameField, "Age:", ageField, "Disease:", diseaseField};

        int option = JOptionPane.showConfirmDialog(this, message, "Add Patient", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String disease = diseaseField.getText();
            patientDAO.addPatient(name, age, disease);
            JOptionPane.showMessageDialog(this, "Patient added successfully!");
        }
    }

    private void addDoctorDialog() {
        JTextField nameField = new JTextField();
        JTextField specializationField = new JTextField();

        Object[] message = {"Name:", nameField, "Specialization:", specializationField};

        int option = JOptionPane.showConfirmDialog(this, message, "Add Doctor", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            doctorDAO.addDoctor(nameField.getText(), specializationField.getText());
            JOptionPane.showMessageDialog(this, "Doctor added successfully!");
        }
    }

    private void showPatients() {
        List<String> patients = patientDAO.getPatients();
        JOptionPane.showMessageDialog(this, patients.isEmpty() ? "No patients found." : String.join("\n", patients), "Patients", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showDoctors() {
        List<String> doctors = doctorDAO.getDoctors();
        JOptionPane.showMessageDialog(this, doctors.isEmpty() ? "No doctors found." : String.join("\n", doctors), "Doctors", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showAvailableRooms() {
        List<String> rooms = roomDAO.getAvailableRooms();
        JOptionPane.showMessageDialog(this, rooms.isEmpty() ? "No rooms available." : String.join("\n", rooms), "Available Rooms", JOptionPane.INFORMATION_MESSAGE);
    }

    private void assignRoomDialog() {
        String roomId = JOptionPane.showInputDialog(this, "Enter Room ID:");
        String patientId = JOptionPane.showInputDialog(this, "Enter Patient ID:");

        if (roomId != null && patientId != null) {
            boolean success = roomDAO.assignRoom(Integer.parseInt(roomId), Integer.parseInt(patientId));
            JOptionPane.showMessageDialog(this, success ? "Room assigned successfully!" : "Failed to assign room.");
        }
    }

    private void showAssignedRooms() {
        List<String> rooms = roomDAO.getAssignedRooms();
        JOptionPane.showMessageDialog(this, rooms.isEmpty() ? "No rooms assigned." : String.join("\n", rooms), "Assigned Rooms", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HospitalManagementGUI().setVisible(true));
    }
}
