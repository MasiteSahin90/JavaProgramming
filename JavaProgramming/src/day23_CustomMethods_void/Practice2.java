package day23_CustomMethods_void;

public class Practice2 {
    /*
    create a method that can check if a person is eligible to buy
alcohol
     */
    public static void main(String[] args) {
       isEligible(32);


    }

    public static void isEligible(int age){



        if (age>=21 ){
            System.out.println("is eligible");
        }else{
            System.out.println("not eligible");
        }

    }







}
