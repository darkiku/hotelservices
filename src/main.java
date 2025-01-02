import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(101));
        rooms.add(new Room(102));
        rooms.add(new Room(103));

        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest("Alice"));
        guests.add(new Guest("Bob"));

        List<Booking> bookings = new ArrayList<>();
        bookings.add(new Booking(rooms.get(0), guests.get(0)));
        bookings.add(new Booking(rooms.get(1), guests.get(1)));

        System.out.println("Rooms:");
        rooms.forEach(System.out::println);

        System.out.println("\nAvailable rooms:");
        rooms.stream().filter(Room::isAvailable).forEach(System.out::println);

        System.out.println("\nBookings:");
        bookings.forEach(System.out::println);
    }
}

