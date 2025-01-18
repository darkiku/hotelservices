public class Guest {
    private int id;
    private String name;
    private String contactNumber;

    public Guest(int id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Guest ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Contact: " + contactNumber + "\n";
    }
}
