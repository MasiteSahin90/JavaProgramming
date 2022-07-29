package day21_ForEachLoop;

public class Palindromeee {

    public static void main(String[] args) {
       /*
       Write a program that can count the even and odd number from an
       array of integers
       Note: MUST use for each loop
        */

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int oddnum =0;
        int evennum = 0;

        for (int each : numbers) {
            if(each%2 == 0){
                evennum ++;
            }else {
                oddnum++;
            }
        }
        System.out.println(oddnum);
        System.out.println(evennum);

    }
}
