package app;

import app.Park;public class Park2 {
    public static void main(String[] args) {

        Park park = new Park();

        Park.Attraction a1 = park.new Attraction(
                "Американские горки",
                "09:00 - 20:00",
                300.80
        );

        a1.printInfo();
    }
}