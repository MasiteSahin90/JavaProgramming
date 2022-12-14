package day43_Abstraction.Car;

public abstract class Car {

    private final String brand, make;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String make, String color, int year, double price) {
        this.brand = brand;
        this.make = make;
        setColor(color);
        if (year < 1886) {
            throw new RuntimeException("Invalid year: " + year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if(price <=0){
            throw new RuntimeException("Invalid price " +price);
        }
        this.price = price;
    }

    //abstract method: doesnt have a body, wants to be overriden, cant be private
    //since private cant be overriden, and cant be final, or static
    public void stop(){
        System.out.println("Press the break");
    }
    public abstract void start();

    //hash code when creating an object if you dont have it
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + make + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

}
