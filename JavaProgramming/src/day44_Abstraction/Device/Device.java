package day44_Abstraction.Device;

public abstract class Device {
    /*
    Device Task:
1. Create an abstract class named Device:
Variables:
brand (final), model(final),
price, color, size (final), hasBattery, hasPowerButton
Encapsulate all the fields
Add a constructor to set all the fields
Condition:
1. brand,
model color and size can not be null (if obj == null means it's error)
2. brand,
model color and size can not be empty
3. price
can not be set to negative or zero
Abstract Methods:
turnOn(), turnOff()
None Abstract methods:
toString(): displays brand, model,
price
     */

    private final String brand , model,size;
    private double price ;
    private String color;
    private boolean hasBattery , hasPoweButton;

    public Device(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPoweButton) {
        if (brand.isEmpty()|| brand.isBlank() || brand.equals(null)){
            throw new RuntimeException();
        }
        this.brand = brand;
        if (model.isEmpty()|| model.isBlank() || model.equals(null)){
            throw new RuntimeException();
        }
        this.model = model;
        if (size.isEmpty()|| size.isBlank() || size.equals(null)){
            throw new RuntimeException();
        }
        this.size = size;
        setPrice(price);
        setColor(color);
        this.hasBattery = hasBattery;
        this.hasPoweButton = hasPoweButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPoweButton() {
        return hasPoweButton;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException();
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color.isEmpty()|| color.isBlank() || color.equals(null)){
            throw new RuntimeException();
        }
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPoweButton(boolean hasPoweButton) {
        this.hasPoweButton = hasPoweButton;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPoweButton=" + hasPoweButton +
                '}';
    }
}
