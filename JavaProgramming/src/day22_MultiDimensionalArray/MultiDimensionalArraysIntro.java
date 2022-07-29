package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {

    public static void main(String[] args) {

        String[] group1 = {"jon","james" ,"jo"};
        String[] group2 = {"ali","jale" ,"joni"};
        String[] group3 = {"joni","jamy" ,"johanna"};

        String[][] groups = new String[3][];

        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.deepToString(groups));


        System.out.println("----------------------------------------");

       int[] num1 = {1,2,3};
       int[] num2 = {4,5,6,7};
       int[] num3 = {8,9};

        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9}};

        //first bracket for the arrays index second one for array's array

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[2][1]);


    }
}
