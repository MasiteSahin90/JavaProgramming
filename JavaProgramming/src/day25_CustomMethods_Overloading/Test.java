package day25_CustomMethods_Overloading;

import Utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str =  "java programming language";

        StringUtility.printEachChar(str);

        System.out.println("------------------");

        String s1 = "wooden spoon";

        String reverse = StringUtility.reverse(s1);

        System.out.println("reverse = " + reverse);

        System.out.println("------------------");

        String s2 = "level";

        boolean palindrome = StringUtility.isPalindrome(s2);

        System.out.println("palindrome = " + palindrome);

        System.out.println("------------------");

        String[] names = {"ala","ayya","ahmet"};

        int count = 0;

        for (String each : names) {

            if (StringUtility.isPalindrome(each)){
                count++;
            }

        }
        System.out.println("count = " + count);

        System.out.println("------------------");

        String a = "aabbc";
        String dublicates = StringUtility.removeDublicates(a);
        System.out.println(dublicates);
    }
}
