import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new price(100, "yes", "single room"));
        rooms.add(new price(101, "yes", "double room"));
        rooms.add(new price(102, "yes", "triple room"));
        rooms.add(new price(103, "yes", "lux room"));
        rooms.add(new price(104, "yes", "single room"));
        rooms.add(new price(105, "yes", "double room"));
        rooms.add(new price(106, "yes", "triple room"));
        rooms.add(new price(107, "yes", "lux room"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWe have rooms 100-107 available");
            System.out.println("To get room info, enter: 1");
            System.out.println("To book a room, enter: 2");
            System.out.println("To exit, enter: 3");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Информация о комнате
                    System.out.println("Enter room number:");
                    int roomNumber = scanner.nextInt();
                    Room room = findRoomByNumber(rooms, roomNumber);
                    if (room != null) {
                        System.out.println(room);
                    } else {
                        System.out.println("Room not found!");
                    }
                    break;

                case 2: // Бронирование комнаты
                    System.out.println("Enter room number to book:");
                    int bookNumber = scanner.nextInt();
                    Room roomToBook = findRoomByNumber(rooms, bookNumber);
                    if (roomToBook != null && roomToBook.getAviable().equals("yes")) {
                        System.out.println("Room booked successfully!");
                        roomToBook.setAviable("no");
                    } else if (roomToBook != null) {
                        System.out.println("Room is already booked!");
                    } else {
                        System.out.println("Room not found!");
                    }
                    break;

                case 3: // Выход
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static Room findRoomByNumber(List<Room> rooms, int number) {
        for (Room room : rooms) {
            if (room.getNumber() == number) {
                return room;
            }
        }
        return null;
    }
}
