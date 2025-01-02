public class Guest {
    private String name;

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Guest: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Guest && name.equals(((Guest) obj).name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
