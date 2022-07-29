package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        Integer num2=num1; //autoboxing

        int num3 = num2;  //unboxing

        System.out.println("-------------------------");

        Integer num4 = 100;

        long longValue = num4; //you can convert all the wrapper classes to the primitives

        System.out.println("-------------------------");

        Byte b1 = 25;

        byte a1  = b1;

        short a2 = b1;

        long a3 = b1;

        System.out.println("-------------------------");

        Integer a4 = 24;
        Integer a5 = a4;

        System.out.println("-------------------------");

        int[] numbers = {1,2,3,4,5};

        Integer[] numbers2 = {1,2,3,4,5};



    }
}
