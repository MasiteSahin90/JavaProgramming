package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num1 = input.nextInt();
        System.out.println("Enter a decimal");
        double num2 = input.nextDouble();

        double result = num1 * num2;
        System.out.println(result);
        input.close();
        /*
        after this line we cannot use the scanner
        System.out.println("enter an integer:");
        int num3 = input.nextInt();
        System.out.println(num3); this lines
        doesnt work it gives error after executing the
        part till closing input
         */

    }

}
