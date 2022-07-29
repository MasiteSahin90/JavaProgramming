package day16_ForLoopStringPractice;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid

         */
        Scanner scan = new Scanner(System.in);
        int result = 0;
        System.out.println("enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 >0 && num2 >0){
                for (int j = 1; j <=num2 ; j++) {
                    result += num1;
                }

            }else{
            System.out.println("invalid");

                }

                System.out.println(result);
        scan.close();
            }



        }









