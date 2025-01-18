public class Room {
    private int number;
    private String aviable;
    private String type;
    public Room() {

    }
    public Room(int number, String aviable, String type) {
        setValues(number, aviable, type);
    }
    public void setValues(int number, String aviable, String type) {
        this.number = number;
        this.aviable = aviable;
        this.type = type;
    }
    public String getAviable() {
        return aviable;
    }
    public void setAviable(String aviable) {
        this.aviable = aviable;
    }
    public int getNumber() {
        return number;
    }
    public String toString() {
        String a = "Room number: " + this.number + "\n";
        String b = "Aviable:" + this.aviable + "\n";
        String c = "Room type:" + this.type + "\n";
        return a + b + c;
    }

}
