package day10_NestedIf;

import java.util.Scanner;

public class BiggerNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num1 = input.nextInt();
        System.out.println("Enter an integer");
        int num2 = input.nextInt();
        System.out.println("Enter an integer");
        int num3 = input.nextInt();

       String result = (num1> num2 && num1>num3)? num1 + " is the biggest"
                :(num2>num1 && num2>num3)? num2 + " is the biggest"
                :num3 + " is the biggest";
        System.out.println(result);
        input.close();




    }
}
