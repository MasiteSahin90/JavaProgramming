package day01_JavaIntro;

import Utilities.StringUtility;
import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodsPractice4;

public class Test {

    public static void main(String[] args) {


        String str = "aaaabbbbbcccc";

        str = ReturnMethodsPractice4.removeDublicates(str);

        System.out.println(str);

        String name = "Java Programming";

        String reversedname = ReturnMethodIntro.reverse(name);

        System.out.println(reversedname);

    String str1 = "wooden spoon";

        StringUtility.printEachChar(str1);

    String str2 = "masite sahin" ;

    String reverse = StringUtility.reverse(str2);
        System.out.println("reverse = " + reverse);

    }
}
