package day33_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public double price;

    public static String operatingSystem = "IOS";

    public String color ;

    public String size;

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean hasCamera = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;

   /* public static void printModelAndPrice(){
        System.out.println(model+" "+ price);
    } // static does not print instance variable
*/
    public void printOperatingSysyem(){ //void method can print both of them

        System.out.println(operatingSystem);
        System.out.println(model+" "+ price);

    }












}
