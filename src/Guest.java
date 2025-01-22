import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Guest {
    private int id;
    private String name;
    private String contactNumber;

    public Guest(int id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    // Добавление гостя
    public static void addGuest(Connection connection, Guest guest) throws SQLException {
        String query = "INSERT INTO guests (id, name, contact_number) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, guest.getId());
            stmt.setString(2, guest.getName());
            stmt.setString(3, guest.getContactNumber());
            stmt.executeUpdate();
            System.out.println("Guest added successfully!");
        }
    }

    // Получение всех гостей
    public static void getAllGuests(Connection connection) throws SQLException {
        String query = "SELECT * FROM guests";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Guest ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Contact Number: " + rs.getString("contact_number"));
                System.out.println("-----------------------------");
            }
        }
    }

    // Удаление гостя
    public static void deleteGuest(Connection connection, int guestId) throws SQLException {
        String query = "DELETE FROM guests WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, guestId);
            stmt.executeUpdate();
            System.out.println("Guest deleted successfully!");
        }
    }
}
