package day14_String;

import java.util.Scanner;

public class NewNeverMind {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();

        int wordLong = word.length();

        char word1 = word.charAt(word.length()-1);
        char word2 = word.charAt(word.length()-2);

        String result = (""+word1+word2);
        String result1 ="";

        if (result.equals("ly")){
            result1="really";
        }else {
            result1="never mind";
        }

        System.out.println(result1);

    }
}
