import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101));
        rooms.add(new Room(102));
        rooms.add(new Room(103));
        rooms.add(new Room(104));

        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest("Alice"));
        guests.add(new Guest("Bob"));

        List<Booking> bookings = new ArrayList<>();
        bookings.add(new Booking(rooms.get(0), guests.get(0)));
        bookings.add(new Booking(rooms.get(1), guests.get(1)));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu: \n1. Show all rooms \n2. Search room status \n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAll Rooms:");
                    for (Room room : rooms) {
                        System.out.println(room);
                    }
                    break;
                case 2:
                    System.out.print("Enter room number to search: ");
                    int roomNumber = scanner.nextInt();
                    Room foundRoom = null;
                    for (Room room : rooms) {
                        if (room.getNumber() == roomNumber) {
                            foundRoom = room;
                            break;
                        }
                    }
                    if (foundRoom != null) {
                        System.out.println(foundRoom);
                    } else {
                        System.out.println("Room not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
