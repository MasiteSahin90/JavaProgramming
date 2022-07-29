package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversedTheSecondWord {

    public static void main(String[] args) {

        String sentence = "I love Java";


    String[] s =  sentence.split(" ");

    String reverse = "";

        for (int i = s[1].length()-1; i >=0 ; i--) {
            reverse += s[1].charAt(i);
        }

        System.out.println(reverse);

        // sentence = sentence.replaceFirst(s[1],reverse);

        s[1] = reverse;

        System.out.println(Arrays.toString(s));
        String result = "";
        for (String each : s){
            result +=each + " ";
        }
        System.out.println(result);


    }
}
