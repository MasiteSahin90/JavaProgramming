package day38_Inheritance.carTask;

public class Toyota extends Car {


    public Toyota( String model, int year, double price, String color, int miles) {
        super("Totota", model, year, price, color, miles);
    }


    public void reliable(){
        System.out.println(brand + " "+ model + " is reliable");
    }

    public void start(){
        System.out.println("Twist the key to ignition " + brand + " " + model );
    }





}
