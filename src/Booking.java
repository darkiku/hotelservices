public class Booking {
    private Room room;
    private Guest guest;
    private int nights;

    public Booking(Room room, Guest guest, int nights) {
        this.room = room;
        this.guest = guest;
        this.nights = nights;
    }

    public Room getRoom() {
        return room;
    }

    public Guest getGuest() {
        return guest;
    }

    public int getNights() {
        return nights;
    }

    public int calculateTotalPrice() {
        if (room instanceof price) {
            return nights * ((price) room).getPricePerNight();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Booking Details:\n" +
                guest.toString() +
                room.toString() +
                "Nights: " + nights + "\n" +
                "Total Price: " + calculateTotalPrice() + "$\n";
    }
}

