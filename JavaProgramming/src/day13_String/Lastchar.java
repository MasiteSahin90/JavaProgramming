package day13_String;

import java.util.Scanner;

public class Lastchar {
    public static void main(String[] args) {
        /*
        3. write a program that can check if the first and
        last characters of the string are same
            ex:
                level
            output:
                same
         */

        Scanner scan = new Scanner (System.in);

        while(true) {

            System.out.println("enter a word");
            String word = scan.next();


            char ch1 = word.charAt(0);
            char ch2 = word.charAt(word.length() - 1);

            if (ch1 == ch2) {
                System.out.println("same");
            }
            if(ch1 != ch2){
                System.out.println("not same");
            }

            System.out.println("would you like to continue");
            String ans = scan.next().toLowerCase();

            while(!(ans.equals("yes") || ans.equals("no")) ){
                System.out.println("invalid re enter" );
                ans = scan.next().toLowerCase();
                System.out.println("enter a word");
                word = scan.next();
                if (ch1 == ch2) {
                    System.out.println("same");
                }
                if(ch1 != ch2){
                    System.out.println("not same");
                }

                System.out.println("would you like to continue");
                ans = scan.next().toLowerCase();


                }
                if(ans.equals("no")){
                System.exit(0);

            }

        }


    }
}
