package day38_Inheritance.carTask;

import day32_Constructor.Test;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota t = new Toyota("camry",123,2345.4,"fddd",2345);

        Tesla tes = new Tesla("Model S",12,2345.6,"rewr",2345);

        BMW b = new BMW("3.20",123,234,"asdae",23456);

        tes.start();
        t.start();
        b.start();
    }
}
