package day37_Inheritance.phoneTask;

public class Iphone extends Phone {
    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long number){
        System.out.println(brand + " " + model + " is having facetime with phone number " + number);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having facetime with email " + email);
    }


}
