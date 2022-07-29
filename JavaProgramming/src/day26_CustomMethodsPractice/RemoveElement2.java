package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

public class RemoveElement2 {

    public static int[] removeElement(int[] array, int index){


        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if(i != index){
                result = ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }
}
