package day15_ForLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int n  = scan.nextInt();
        int sum = 1 ;

        for(int i = n; i >= 1 ; i-- ){

         sum *= i ;

        }
        System.out.println("sum = " + sum);

    }

}
