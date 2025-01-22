public class price extends Room {
    private int pricePerNight; // Цена за ночь

    // Конструктор
    public price(int number, String available, String type) {
        super(number, type, available.equalsIgnoreCase("yes"), 0); // Преобразование строки в boolean и добавление нулевой цены по умолчанию
        setPricePerNight(type); // Установка цены в зависимости от типа комнаты
    }

    // Устанавливает цену за ночь в зависимости от типа комнаты
    public void setPricePerNight(String type) {
        if (type.equalsIgnoreCase("single room")) {
            this.pricePerNight = 120;
        } else if (type.equalsIgnoreCase("double room")) {
            this.pricePerNight = 160;
        } else if (type.equalsIgnoreCase("triple room")) {
            this.pricePerNight = 250;
        } else if (type.equalsIgnoreCase("lux room")) {
            this.pricePerNight = 700;
        } else {
            this.pricePerNight = 0; // Значение по умолчанию для неизвестных типов
        }
    }

    // Геттер для цены за ночь
    public int getPricePerNight() {
        return pricePerNight;
    }

    @Override
    public String toString() {
        return super.toString() + ", Price Per Night: " + pricePerNight;
    }
}
