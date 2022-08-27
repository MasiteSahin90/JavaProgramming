package day44_Abstraction.Device;



public abstract class Phone extends Device {
    public Phone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPoweButton) {
        super(brand, model, size, price, color, hasBattery, hasPoweButton);
    }

    public void call(long phoneNumber){
        System.out.println(phoneNumber + " is calling");
    }

    public void text(long phoneNumber){
        System.out.println(phoneNumber + " is texting");
    }





    /*
    Create a child abstract class of Device named Phone:
Extra Methods (none Abstract):
call(long
phoneNum)
text(long
phoneNum)
toString()
     */


}
