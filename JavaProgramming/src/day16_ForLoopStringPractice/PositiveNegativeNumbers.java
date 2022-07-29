package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Output:
3 positive and 1 negative
         */

        Scanner scan = new Scanner (System.in);
        int countPos = 0 ; int countNeg = 0;
        String result = "";
        for (int i = 1; i <6 ; i++) {
            System.out.println("enter a number");
            int num = scan.nextInt();
            if(num>0){
                countPos++;
            }else{
                countNeg++;
            }
        }
        System.out.println(countPos + " positive" + "," + countNeg + " negative");


        scan.close();





    }
}