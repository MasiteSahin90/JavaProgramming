package day17_While_DoWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your username");
        String username = scan.next();

        System.out.println("enter your password");
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("logged in");
        } else {
            int attempts = 3;
            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0) {
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("enter your username");
                username = scan.next();

                System.out.println("enter your password");
                password = scan.next();

                attempts--;
            }
            if (username.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("logged in");
            } else {
                System.out.println("your account is locked");
            }
        }
        scan.close();
    }
}

