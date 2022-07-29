package Utilities;

import java.util.Arrays;

public class StringUtility {
    //prints all the charachters of the given string
    public static void printEachChar(String str) {
        //prints all the characters in the string
        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));
        }
    }

    // reverses the given string and returns the new string
    public static String reverse(String str){
        String reverse = "";


        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+= str.charAt(i);
        }
        return reverse;
    }

    // checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str){
       return  reverse(str).equalsIgnoreCase(str);
    }

    //checks if the given string is anagram or not, returns boolean
    public static boolean anagram(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    //removes the dublicates from given string, returns string
    public static String removeDublicates(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!(result.contains("" + each))){
                result+=each;
            }

        }
        return result;
    }

}


