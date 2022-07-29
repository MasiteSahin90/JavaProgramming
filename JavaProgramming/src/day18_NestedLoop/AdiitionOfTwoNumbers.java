package day18_NestedLoop;

import java.util.Scanner;

public class AdiitionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        System.out.println("enter your first number");
        int num1 = scan.nextInt();

        System.out.println("enter your second number");
        int num2 = scan.nextInt();

        System.out.println("addition " + (num1+num2));

        System.out.println("do you want to continue?");
        String answer = scan.next().toLowerCase();

        while(answer.equals("yes")){
            System.out.println("enter your first number");
            num1 = scan.nextInt();

            System.out.println("enter your second number");
            num2 = scan.nextInt();

            System.out.println("addition " + (num1+num2));

            System.out.println("do you want to continue?");
            answer = scan.next();

            if(answer.equals("no")){
                break;
            }else if (!(answer.equals("yes")&& answer.equals("no"))){
                System.out.println("invalid answer");
            }

        }




    }
}
