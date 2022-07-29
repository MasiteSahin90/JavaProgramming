package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1,1,2,3,4,4,5,5,6,6,6,7};

        int[] unique = uniqueElements(array);

        System.out.println(Arrays.toString(unique));

        double[] arr = {1.1 , 1.1, 2.2};

        double[] uniq= uniqueElements(arr);

        System.out.println(Arrays.toString(uniq));
    }

    //returns the unique elements of the arrray as a new array
    public static int[] uniqueElements(int[] array) {

        int[] result = {};

        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
               result =  ArraysUtility.addElement(result,each);
            }
        }
            return result;
    }

    //returns the unique elements of the arrray as a new array
    public static double[] uniqueElements(double[] array) {

        double[] result = {};

        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the arrray as a new array
    public static char[] uniqueElements(char[] array) {

        char[] result = {};

        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the arrray as a new array
    public static String[] uniqueElements(String[] array) {

        String[] result = {};

        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result =  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}

