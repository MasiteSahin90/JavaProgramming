package day14_String;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        /*
        Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the email address");
        String email = scan.nextLine();

        String email1 = email.substring(0,email.indexOf('_'));
        String email2 = email.substring(email.indexOf('_') + 1 , email.indexOf('@'));
        String rest = email.substring(email.indexOf("@"));

        String emails = email2 + "" + email1 + rest;
        System.out.println(emails);



    }
}
