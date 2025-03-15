package HMS;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAO {
    private Connection conn;

    public DoctorDAO() {
        conn = DatabaseConnection.getConnection();
    }

    public void addDoctor(String name, String specialization) {
        String query = "INSERT INTO Doctors (name, specialization) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setString(2, specialization);
            pstmt.executeUpdate();
            System.out.println("Doctor added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> getDoctors() {
        List<String> doctors = new ArrayList<>();
        String query = "SELECT * FROM Doctors";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                String doctor = "ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Specialization: " + rs.getString("specialization");
                doctors.add(doctor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctors;
    }
}
