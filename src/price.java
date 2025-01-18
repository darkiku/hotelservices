public class price extends Room {
    private int pricePerNight;

    public price(int number, String aviable, String type) {
        super(number, aviable, type);
        setPricePerNight(type);
    }
    @Override
    public void setValues(int number, String aviable, String type) {
        super.setValues(number, aviable, type);
    }
    public void setPricePerNight(String type) {
        if (type.equals("single room")) {
            this.pricePerNight = 120;
        } else if (type.equals("double room")) {
            this.pricePerNight = 160;
        } else if (type.equals("triple room")) {
            this.pricePerNight = 250;
        } else if (type.equals("lux room")) {
            this.pricePerNight = 700;
        } else {
            this.pricePerNight = 0; // Значение по умолчанию
        }
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    @Override
    public String toString() {
        return super.toString() + "Price per night: " + this.pricePerNight + "$\n";
    }
}

