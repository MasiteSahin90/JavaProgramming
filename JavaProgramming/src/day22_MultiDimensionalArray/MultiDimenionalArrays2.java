package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimenionalArrays2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int[] arr3 = {1,2,3};

        int[][] arr2D = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] arr2d = {{1,2,3},{1,2,3},{1,2,3}};

        int[][][] arr3D = {{{1,2,3},{4,5,6},{7,8,9}},{{10,20,30},{10,20,30},{10,20,30}}};

        // [indexnum of 2D array] [indexnum of 1D array] [index of array]

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][2]));
        System.out.println((arr3D[1][2][1]));


        for (int[][] each2D : arr3D){
            for (int[] each1D : each2D){
                for(int element : each1D){
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }





    }
}
