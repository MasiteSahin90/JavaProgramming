package day43_Abstraction.Car;

public final class Tesla extends Car {

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(getMake() + getMake() + " is starting");
    }

    public void autopilot(){
        System.out.println(getMake() + getMake() + " has auto pilot feature");
    }
}
