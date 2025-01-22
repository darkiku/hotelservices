import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Room {
    private int number;
    private String type;
    private boolean available;
    private int pricePerNight;

    // Конструктор
    public Room(int number, String type, boolean available, int pricePerNight) {
        this.number = number;
        this.type = type;
        this.available = available;
        this.pricePerNight = pricePerNight;
    }

    // Геттеры
    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    // Добавление комнаты в базу данных
    public static void addRoom(Connection connection, Room room) throws SQLException {
        String query = "INSERT INTO rooms (room_number, room_type, is_available, price_per_night) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, room.getNumber());
            stmt.setString(2, room.getType());
            stmt.setBoolean(3, room.isAvailable());
            stmt.setInt(4, room.getPricePerNight());
            stmt.executeUpdate();
            System.out.println("Room added successfully!");
        }
    }

    // Получение всех комнат
    public static void getAllRooms(Connection connection) throws SQLException {
        String query = "SELECT * FROM rooms";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Room Number: " + rs.getInt("room_number"));
                System.out.println("Room Type: " + rs.getString("room_type"));
                System.out.println("Available: " + rs.getBoolean("is_available"));
                System.out.println("Price Per Night: " + rs.getInt("price_per_night"));
                System.out.println("-----------------------------");
            }
        }
    }
}
