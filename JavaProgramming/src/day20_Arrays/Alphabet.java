package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] letters = new char[26];

        for (char i = 0 ,j= 'z'; i < letters.length && j>='a' ; i++,j--) {
                letters[i] = j;
        }
        System.out.println(Arrays.toString(letters));
    }
}
