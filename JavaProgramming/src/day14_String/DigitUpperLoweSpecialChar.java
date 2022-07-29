package day14_String;

import java.util.Scanner;

public class DigitUpperLoweSpecialChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        /*
        Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table

         */
        System.out.println("enter a word");
        String word = scan.next();

        scan.close();

        char firstchar = word.charAt(0);

        String result = "";

        if (firstchar >='0' && firstchar <='9'){
            result = "first character is digit";
        } else if (firstchar >= 'a' && firstchar <='z') {
            result="first character is lowercase";
        } else if (firstchar >= 'A' && firstchar <='Z') {
            result = "first character is uppercase";
        }else{
            result = "first character is special character";
        }

        System.out.println("result = " + result);
    }
}
