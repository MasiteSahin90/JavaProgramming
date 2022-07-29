package day15_ForLoop;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
        Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:
         */

        String str = "ABC12D3";
        int result = 0;
        char ch = '0';

        for (int i = 0; i < str.length() ; i++) {
            if (ch >= 0 && ch<= 9){
                result+=ch;
            }

        }
        System.out.println("result = " + result);



    }

}
