public class Booking {
    private final Room room;
    private final Guest guest;

    public Booking(Room room, Guest guest) {
        this.room = room;
        this.guest = guest;
        room.book();
    }

    @Override
    public String toString() {
        return guest.getName() + " booked Room " + room.getNumber();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Booking)) return false;
        Booking other = (Booking) obj;
        return room.equals(other.room) && guest.equals(other.guest);
    }

    @Override
    public int hashCode() {
        return room.hashCode() + guest.hashCode();
    }
}

