package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[] students = {"ayse" , "ali" , "ahmet", "veli"};
        String[] earlybird = Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(earlybird));

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        numbers = Arrays.copyOf(numbers,5);

        System.out.println(Arrays.toString(numbers));


        System.out.println("-----------------------------");

        char[] ch1= {'a','b','c','d','e','f','g'};
        char[] ch2 = Arrays.copyOfRange(ch1,3,6);

        System.out.println(Arrays.toString(ch2));
    }
}
