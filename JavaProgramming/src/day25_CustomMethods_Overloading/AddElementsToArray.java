package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4};

       numbers =  addInteger(numbers,5);

        System.out.println(Arrays.toString(numbers));

        double[] numbers2 = {1.5,2.5,3.5,4.5};

        numbers2 =  addDouble(numbers2 , 5.5);

        System.out.println(Arrays.toString(numbers2));

        String[] names = { "ali", "veli" , "ayse" ,"alp"};

        names = addString(names,"masite");

        System.out.println(Arrays.toString(names));

        char[] arrr = {'a','b', 'c', 'd'};

        arrr = addChar(arrr,'d');

        System.out.println(Arrays.toString(arrr));

    }


    public static int[] addInteger(int[] array , int element){

       int[] result = new int[array.length+1];


       int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    public static double[] addDouble(double[] array , double element){

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each: array ) {
            result[i++] = each;
        }

        result[i] = element;
        return result;
    }

    public static String[] addString(String[] array , String element){

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each: array ) {
            result[i++] = each;
        }

        result[i] = element;
        return result;
    }

    public static char[] addChar(char[] array , char element){

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each: array ) {
            result[i++] = each;
        }

        result[i] = element;
        return result;
    }
}
