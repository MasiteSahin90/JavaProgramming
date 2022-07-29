package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner  (System.in);
        System.out.println("enter the first number");
        int num1 = scan.nextInt();
        System.out.println("enter the second number");
        int num2 = scan.nextInt();
        System.out.println("enter a math operator");
        char operator = scan.next().charAt(0);

        while(  !(operator == '+' || operator == '-')  ){
            System.err.println("invalid operator please re enter it");
            operator = scan.next().charAt(0);
        }
        System.out.println((operator == '+')? num1 + num2 : num1-num2);

        scan.close();
    }
}
