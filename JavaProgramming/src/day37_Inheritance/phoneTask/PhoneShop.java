package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {


        Iphone iphone = new Iphone("Iphone 12","6.7 inches",1000,"Black");

        Samsung samsung = new Samsung("galaksy s19","6 inches",900,"White");

        Nokia nokia = new Nokia("Brick","4 inches",50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        samsung.text(234567890);
        samsung.freeze();
        nokia.selfDefence();

        System.out.println(iphone.hasBattery);
        System.out.println(samsung.hasBattery);
        System.out.println(nokia.hasBattery);




    }


}
