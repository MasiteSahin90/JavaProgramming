package day20_Arrays;

import java.util.Arrays;

public class Masite {

    public static void main(String[] args) {
         /*
         create string array, and store the names of your  class mates (10)
reverse each students names and print them in separate lines
ex:
arr = {java, python, c#}
output:
avaJ
nohtyp
#c
          */
        String[] arr =  {"java", "python", "c#"};

        for (int i = 0; i < arr.length; i++) {
            String name = arr[i];
            String reverse = "";
            for (int j = name.length() - 1; j >= 0; j--) {
                 reverse += name.charAt(j);
            }
            System.out.println(reverse);

            /*
            for (String each : arr) {
            each = arr[i++];
            String reverse = "";
            for (int j = each.length() - 1; j >= 0; j--) {
                 reverse += each.charAt(j);
            }
             */
        }

        System.out.println("--------------------------------------------------------");

    /*
    Write a program that can reverse an array of integers and
returns it as new array
ex:(4-0 3-1 2-2 1-3 0-4)
array = {1,2,3,4,5};
output:
reversedArray = {5,4,3,2,1};

rea[0] = array[4]
rea[1] = array[3]
     */

        int[] array = {1,2,3,4,5};

        int[] reversearray = new int[array.length];

        for (int a = array.length - 1 , b = 0; a >= 0; a--, b++) {
            reversearray[b] += array[a];
        }
        System.out.println(Arrays.toString(reversearray));






    }
}
