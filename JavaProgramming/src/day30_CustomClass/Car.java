package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public int price;

    public void drive(){
        System.out.println( brand + " is driving");
    }

    public void setInfo(String carbrand , String carmodel, String carcolor, int caryear, int carprice){
        brand = carbrand;
        model = carmodel;
        color = carcolor;
        year = caryear;
        price = carprice;
    }
    public void start(){
        System.out.println(brand + " has started");
    }

    public void stop(){
        System.out.println(brand + " has stopped");
    }





    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

}
