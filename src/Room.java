public class Room {
    private final int number;
    private boolean available = true;

    public Room(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isAvailable() {
        return available;
    }

    public void book() {
        available = false;
    }

    @Override
    public String toString() {
        return "Room " + number + " (Available: " + available + ")";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Room && number == ((Room) obj).number;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(number);
    }
}
