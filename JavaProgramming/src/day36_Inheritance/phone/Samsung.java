package day36_Inheritance.phone;

public class Samsung extends Phone {
    /*
    Create a sub class of Phone named Samsung:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
freeze()
toString()
     */

    public void freeze(){
        System.out.println(brand + " is freezing");
    }
}
