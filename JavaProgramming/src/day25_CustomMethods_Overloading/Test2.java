package day25_CustomMethods_Overloading;

import Utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7};
        ArraysUtility.printEachElement(numbers);

        System.out.println("------------------");

        double[] num = {1.1,2.1};
        ArraysUtility.printEachElement(num);

        System.out.println("------------------");

        char[] ch = {'a','b','c'};
        ArraysUtility.printEachElement(ch);

        System.out.println("------------------");

        String[] str = {"ali", "ayse", "ahmet"};
        ArraysUtility.printEachElement(str);

        System.out.println("------------------");

        int[] number = {1,2,3,14,5,6,7};
        int maxi = ArraysUtility.maxNumber(number);
        System.out.println(maxi);

        System.out.println("------------------");

        double[] num1 = {1.1,2.1,3.8,0.1};
        double maxd = ArraysUtility.maxNumber(num1);
        System.out.println(maxd);

        System.out.println("------------------");

        int[] numb = {1,2,3,14,5,6,7};
        boolean cont = ArraysUtility.contains(numb,5);
        System.out.println("cont = " + cont);

        System.out.println("------------------");

        double[] numm = {1.1,2.1,3.8,0.1};
        boolean con = ArraysUtility.contains(numm,1.2);
        System.out.println("con = " + con);

        System.out.println("------------------");

        char[] ch1 = {'a','b','c'};
        boolean co = ArraysUtility.contains(ch1,'b');
        System.out.println("co = " + co);

        System.out.println("------------------");

        String[] st = {"ali", "ayse", "ahmet"};
        boolean conta = ArraysUtility.contains(st,"ayse");
        System.out.println("conta = " + conta);


    }
}
