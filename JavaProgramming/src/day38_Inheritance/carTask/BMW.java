package day38_Inheritance.carTask;
public class BMW extends Car{
    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand + " "+ model + " is breaking down");
    }

    public void racing(){
        System.out.println(brand + " "+ model + " is racing");
    }

    public void start(){
        System.out.println("press the start button for ignition  " + brand + " " + model );
    }


}

