package day15_ForLoop;

import java.util.Scanner;

public class WebAdresses {
    public static void main(String[] args) {
         /*
    Create a class named WebAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a valid website : such as www.amazon.com");

        String userEntry = scan.next();

        int indexOfFirstDot = userEntry.indexOf(".");
        int indexOfSecondDot = userEntry.lastIndexOf(".");


    }


}
