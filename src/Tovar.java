public class Tovar {

    String name;
    String productionDate;
    String manufacturer;
    String countryOfOrigin;
    double price;
    boolean isReserved;

    public Tovar(String name, String productionDate, String manufacturer,
                 String countryOfOrigin, double price, boolean isReserved) {

        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + countryOfOrigin);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + isReserved);
    }
}
