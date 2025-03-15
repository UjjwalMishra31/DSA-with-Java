package HMS;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {
    private Connection conn;

    public RoomDAO() {
        conn = DatabaseConnection.getConnection();
    }

    // Get Available Rooms
    public List<String> getAvailableRooms() {
        List<String> rooms = new ArrayList<>();
        String query = "SELECT * FROM Rooms WHERE isOccupied = FALSE";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                rooms.add("Room ID: " + rs.getInt("id") + " - Type: " + rs.getString("type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rooms;
    }

    // Assign Room to a Patient
    public boolean assignRoom(int roomId, int patientId) {
        String query = "UPDATE Rooms SET isOccupied = TRUE, patient_id = ? WHERE id = ? AND isOccupied = FALSE";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, patientId);
            pstmt.setInt(2, roomId);
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Get Assigned Rooms
    public List<String> getAssignedRooms() {
        List<String> rooms = new ArrayList<>();
        String query = "SELECT Rooms.id, Rooms.type, Patients.name FROM Rooms JOIN Patients ON Rooms.patient_id = Patients.id WHERE isOccupied = TRUE";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                rooms.add("Room ID: " + rs.getInt("id") + " - Type: " + rs.getString("type") + " - Assigned to: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rooms;
    }
}
