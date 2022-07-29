package day17_While_DoWhile;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("enter a number ");
        int num1 = scan.nextInt();
        System.out.println("enter a number");
        int num2 = scan.nextInt();
        String answer = scan.next().toLowerCase();

        while(!(answer.equals("yes"))){
            System.out.println("enter a number ");
            num1 = scan.nextInt();
            System.out.println("enter a number");
            num2 = scan.nextInt();

            System.out.println("do you want to continue");
            answer = scan.next();

        }
        if(!(answer.equals("yes"))){
            System.out.println(num1 + num2);
        }
        scan.close();
    }
}
