package day23_CustomMethods_void;

public class Practice {

    /*
    1. create a method that can print odd numbers between 1~100 in a
same line saperated by space
     */
    public static void main(String[] args) {

        oddNumber();


    }

    public static void oddNumber(){

        for (int i = 1; i <= 99 ; i++) {

            if (i % 2 == 1){
                System.out.print(i + " ");
            }

        }
        System.out.println();

    }





}
