package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for(char each : str.toCharArray()){
            System.out.println(each);
        }

        System.out.println("------------------------");

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));


        String email = "masitesahinn@hotmail.com";
        String[] split = email.split("@");

        System.out.println(Arrays.toString(split));

        String s = "Today is nice day. Today is monday. Today we will lEARN JAVA";

        String[] dot = s.split("\\.");

        System.out.println(Arrays.toString(dot));




    }
}
