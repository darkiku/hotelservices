public class main {
    public static void main(String[] args) {
        class Room {
            private int number;
            private boolean available;

            public Room(int number) {
                this.number = number;
                this.available = true;
            }

            public int getNumber() {
                return number;
            }

            public boolean isAvailable() {
                return available;
            }

            public void book() {
                this.available = false;
            }

            public void display() {
                System.out.println("Room " + number + " (Available: " + available + ")");
            }
        }

        class Guest {
            private String name;

            public Guest(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void display() {
                System.out.println("Guest: " + name);
            }
        }

        class Booking {
            private Room room;
            private Guest guest;

            public Booking(Room room, Guest guest) {
                this.room = room;
                this.guest = guest;
                room.book();
            }

            public void display() {
                System.out.println(guest.getName() + " booked Room " + room.getNumber());
            }
        }
        Room room1 = new Room(101);
        Room room2 = new Room(102);

        Guest guest1 = new Guest("Alice");
        Guest guest2 = new Guest("Bob");

        Booking booking1 = new Booking(room1, guest1);
        Booking booking2 = new Booking(room2, guest2);

        room1.display();
        room2.display();
        booking1.display();
        booking2.display();
    }}


