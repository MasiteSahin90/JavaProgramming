package day12_Scanner;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2 , result;
        char operator;

        Scanner scan = new Scanner(System.in);

        System.out.println("enter two double type numbers :");

        num1 = scan.nextDouble();
        num2 = scan.nextDouble();

        System.out.println("arithmetic operation you want :");
        operator = scan.next().charAt(0);

        System.out.println("is first number bigger?");
        boolean answer = scan.nextBoolean();

        switch (operator){
            case '+':
                result = num1 + num2;
                break;

            case '-':
                if (answer){
                    result = num1 - num2;
                }else{
                    result = num2 - num1;
                }

            case '/':
                if (answer && num2!= 0){
                    result = num1/num2;
                }else {
                    if (num1!=0){
                        result = num2/num1;
                    }else{
                        System.out.println("invalid");
                    }
                }
        }




    }
}
