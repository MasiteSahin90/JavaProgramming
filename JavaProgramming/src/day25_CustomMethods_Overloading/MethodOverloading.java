package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5,6,7};
        Arrays.sort(intArray);

        double[] doubleArray = {1.2,1.3,1.4};
        Arrays.sort(doubleArray);

        char[] charArray = {'a', 'b' ,'c'};
        Arrays.sort(charArray);

        int sum2 = sumOfNumbers(10,20);

        System.out.println(sum2);
    }

    public static int sumOfNumbers(int num1 , int num2){



        return num1 + num2 ;

    }

    public static double sumOfNumbers(double num1 , double num2){
        return num1 + num2;
    }

    public static double sumOfNumbers(double num1 , double num2 , double num3)  {

        return sumOfNumbers(num1 , num2)+num3;
    }

    public static int sumOfNumbers(int num1 , int num2 , int num3){



        return num1 + num2 + num3 ;

    }


    public static int sumOfNumbers(int num1 , int num2 , int num3 , int num4){



        return num1 + num2 + num3 + num4 ;

    }

}
