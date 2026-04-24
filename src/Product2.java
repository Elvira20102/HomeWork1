public class Product2 {
    public static void main(String[] args) {

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product(
                "Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);

        productsArray[1] = new Product(
                "iPhone 15", "10.09.2024",
                "Apple", "USA", 999, false);

        productsArray[2] = new Product(
                "Xiaomi 14", "15.01.2025",
                "Xiaomi", "China", 700, true);

        productsArray[3] = new Product(
                "Pixel 8", "20.10.2024",
                "Google", "USA", 800, false);

        productsArray[4] = new Product(
                "OnePlus 12", "05.03.2025",
                "OnePlus", "China", 850, true);


        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
        }
    }
}