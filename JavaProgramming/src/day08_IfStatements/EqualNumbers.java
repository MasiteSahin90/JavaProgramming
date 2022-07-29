package day08_IfStatements;

public class EqualNumbers {
    public static void main(String[] args) {
        /*write a program that can print the maximum number between two
        numbers, if both are equal then print Equal
        Ex:
        n1= 100, n2 = 200;
        output:
        200 is maximum number
         */
        int n1 = 4566,
                n2 = 355;
        if (n1<n2){
            System.out.println(n2 + " is the maximum number.");
        }else{
            System.out.println(n1 + " is the maximum number.");
        }


    }
}
