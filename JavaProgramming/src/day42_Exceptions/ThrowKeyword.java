package day42_Exceptions;

import day11_Switch_Scanner.ScannerIntro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();

        if (age<0){
           /* System.out.println("invalid age" + age);
            System.exit(1);*/
            throw new InputMismatchException("Age can not be negative"+age);
        }

        if (age>21){
            System.out.println("you are eligible");
        }else {
            throw new RuntimeException("you must be at least 21 years old");
        }




    }
}
