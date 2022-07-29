package day17_While_DoWhile;

import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("will you marry me");

        String a = scan.next().toLowerCase();

        while(!(a.equals("yes") || a.equals("no"))){
            System.out.println("invalid answer , please re-enter");
            a= scan.next();
        }


        if(a.equals("yes")){
            System.out.println("congrats");
        }else {
            System.out.println("goodbye");
        }
        scan.close();
    }
}
