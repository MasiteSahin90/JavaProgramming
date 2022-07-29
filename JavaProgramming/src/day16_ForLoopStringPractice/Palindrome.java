package day16_ForLoopStringPractice;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {

        String word = "ey edip adanada pide ye";

        String reversed = "";

        for (int i = word.length()-1; i >= 0 ; i--) {

            reversed += word.charAt(i);

        }

            if(reversed.toLowerCase().equals(word.toLowerCase())){
                System.out.println("its a palindrome");
            }else {
                System.out.println("not a palindrome");
            }



    }
}
