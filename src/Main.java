import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "55555";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the PostgreSQL database!");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Add Room");
                System.out.println("2. View All Rooms");
                System.out.println("3. Add Guest");
                System.out.println("4. View All Guests");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter room number: ");
                        int roomNumber = scanner.nextInt();
                        scanner.nextLine(); // Очистка буфера
                        System.out.print("Enter room type: ");
                        String roomType = scanner.nextLine();
                        System.out.print("Is the room available? (true/false): ");
                        boolean isAvailable = scanner.nextBoolean();
                        System.out.print("Enter price per night: ");
                        int pricePerNight = scanner.nextInt();

                        Room newRoom = new Room(roomNumber, roomType, isAvailable, pricePerNight);
                        Room.addRoom(connection, newRoom);
                        break;

                    case 2:
                        Room.getAllRooms(connection);
                        break;

                    case 3:
                        System.out.print("Enter guest ID: ");
                        int guestId = scanner.nextInt();
                        scanner.nextLine(); // Очистка буфера
                        System.out.print("Enter guest name: ");
                        String guestName = scanner.nextLine();
                        System.out.print("Enter contact number: ");
                        String contactNumber = scanner.nextLine();

                        Guest newGuest = new Guest(guestId, guestName, contactNumber);
                        Guest.addGuest(connection, newGuest);
                        break;

                    case 4:
                        Guest.getAllGuests(connection);
                        break;

                    case 5:
                        System.out.println("Goodbye!");
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


