package day18_NestedLoop;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in);

        while(true) {
            System.out.println("enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("number is even");
            } else {
                System.out.println("number is odd");
            }

            System.out.println("would you like to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("invalid re enter");
                a = scan.next().toLowerCase();
            }

                if(a.equals("no")){
                    break;
                }






            }









    }
}
