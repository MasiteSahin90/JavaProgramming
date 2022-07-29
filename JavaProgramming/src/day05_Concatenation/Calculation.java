package day05_Concatenation;

public class Calculation {

    public static void main(String[] args) {

        int number1 = 100;
        int number2 = 50;
        int result1 = number1 + number2 ;
        int result2 = number1 - number2 ;
        int resutl3 = number1 * number2 ;

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("resutl3 = " + resutl3);
        System.out.println( number1 + " + " + number2 + " = " + (number1 + number2) );
        System.out.println( number1 + " - " + number2 + " = " + (number1 - number2) );
        System.out.println( number1 + " * " + number2 + " = " + (number1 * number2) );
    }
}
