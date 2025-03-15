package HMS;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {
    private Connection conn;

    public PatientDAO() {
        conn = DatabaseConnection.getConnection();
    }

    public void addPatient(String name, int age, String disease) {
        String query = "INSERT INTO Patients (name, age, disease) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, disease);
            pstmt.executeUpdate();
            System.out.println("Patient added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> getPatients() {
        List<String> patients = new ArrayList<>();
        String query = "SELECT * FROM Patients";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                String patient = "ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Disease: " + rs.getString("disease");
                patients.add(patient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patients;
    }
}
