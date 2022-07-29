package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {

    //replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array , int oldValue , int newValue){

        for (int i = 0; i < array.length; i++) {
            
            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array , double oldValue , double newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array , char oldValue , char newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array , String oldValue , String newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] .equals(oldValue)){
                array[i] = newValue;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        String[] arr = {"ali", "ali"};

        String[] arr1 = replaceAll(arr,"ali","ayse");
        System.out.println(Arrays.toString(arr1));
    }
}
