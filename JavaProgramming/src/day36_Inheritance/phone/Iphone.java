package day36_Inheritance.phone;

public class Iphone extends Phone {
    /*
    Create a sub class of Phone named IPhone:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
faceTime(long phoneNumber)
faceTime(String email)
toString()
     */

    public void faceTime(long number){
        System.out.println(brand + " is having facetime with " + number);
    }
}
