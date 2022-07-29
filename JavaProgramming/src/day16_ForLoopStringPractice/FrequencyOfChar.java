package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        /*
        Write a program that asks user to entera string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string and char");
        String str = scan.nextLine();
        char ch = scan.next().charAt(0);
        int result = 0;

        for (int i = 0; i < str.length() ; i++) {
            char eachchar = str.charAt(i);
            if(eachchar == ch){
                result++;
            }


        }
        System.out.println("result = " + result);
        scan.close();
    }

}
