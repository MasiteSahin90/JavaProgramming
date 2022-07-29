package day26_CustomMethodsPractice;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {4,5};

        int[] arr3= merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));
    }

    public static int[] merge(int[] array1 , int[] array2){

        int[] array = new int[array1.length + array2.length ];
        
        int i = 0;

        for (int each : array1) {
            array[i++] = each;
        }

        for (int each : array2) {
            array[i++] = each;
        }
    return array;
    }

   /* public static int[] merge(int[] array1 , int[] array2){
        int[] result = {};

        for (int each : array1){
            result = addElement(result,each);
        }

        for (int each : array2){
            result = addElement(result,each);
        }
        return result;
    }*/
}
