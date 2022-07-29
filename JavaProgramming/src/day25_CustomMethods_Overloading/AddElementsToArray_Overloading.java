package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        char[] chars = {'a','b' ,'c'};
        String[] names = {"ali","veli","edi","budu"};

        numbers = addElement(numbers,7);
        chars = addElement(chars,'d');
        names = addElement(names,"masuk");


        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(chars));

        System.out.println(Arrays.toString(names));
    }

    public static int[] addElement(int[] array , int element){

        int[] result = new int[array.length+1];


        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;

    }

    public static double[] addElement(double[] array , double element){

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each: array ) {
            result[i++] = each;
        }

        result[i] = element;
        return result;
    }

    public static String[] addElement(String[] array , String element){

        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each: array ) {
            result[i++] = each;
        }

        result[i] = element;
        return result;
    }

    public static char[] addElement(char[] array , char element){

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each: array ) {
            result[i++] = each;
        }

        result[i] = element;
        return result;
    }

}
