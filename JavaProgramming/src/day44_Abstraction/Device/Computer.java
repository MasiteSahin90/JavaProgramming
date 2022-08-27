package day44_Abstraction.Device;

public abstract class Computer extends Device {

    public Computer(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPoweButton) {
        super(brand, model, size, price, color, hasBattery, hasPoweButton);
    }
}
