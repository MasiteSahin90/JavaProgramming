package day19_RecapStringLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");
        int num1 = scan.nextInt();

        System.out.println("enter a math operator");
        char ch = scan.next().charAt(0);

        if (!(ch== '+' || ch == '-')){
            System.err.println("invalid operator");
            System.exit(0);
        }

        System.out.println("enter a number");
        int num2 = scan.nextInt();

        if(ch== '-'){
            System.out.println(num1-num2);
        }else {
            System.out.println(num1+num2);
        }
scan.close();
    }
}
