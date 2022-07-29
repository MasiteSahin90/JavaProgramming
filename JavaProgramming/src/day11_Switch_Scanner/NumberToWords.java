package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        int n = 8;
        String result = (n>= 0 && n<=9)?
                (n== 0)?"Zero" :(n== 1)?"one" :(n== 2)?"two"
                        :(n== 3)?"three":(n== 4)?"four":(n== 5)?"five"
                        :(n== 6)?"six":(n== 7)?"seven":(n== 8)?"eight"
                        : "nine"
                : "invalid number";
        System.out.println(result);



    }
}
